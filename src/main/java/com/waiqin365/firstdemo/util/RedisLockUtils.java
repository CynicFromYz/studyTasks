package com.waiqin365.firstdemo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.exceptions.JedisException;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/**
 * @author cynic
 * @version 1.0
 * redis 实现分布式锁工具类
 * @createTime 2019/11/11 14:25
 */
@Component
public class RedisLockUtils {
    private Logger logger = LoggerFactory.getLogger(RedisLockUtils.class);
    private final static long ACCQUIRE_LOCK_TIMEOUT_IN_MS = 10 * 1000;
    private final static int EXPIRE_IN_SECOND = 5;//锁失效时间
    private final static long WAIT_INTERVAL_IN_MS = 100;
    @Autowired
    private JedisCluster jedisCluster;

    public void lock(final String redisKey) {
        try {
            long now = System.currentTimeMillis();
            long timeoutAt = now + ACCQUIRE_LOCK_TIMEOUT_IN_MS;
            boolean flag = false;
            while (true) {
                String expireAt = String.valueOf(now + EXPIRE_IN_SECOND * 1000);
                long ret = jedisCluster.setnx(redisKey, expireAt);
                if (ret == 1) {//已获取锁
                    flag = true;
                    break;
                } else {//未获取锁，重试获取锁
                    String oldExpireAt = jedisCluster.get(redisKey);
                    if (oldExpireAt != null && Long.parseLong(oldExpireAt) < now) {
                        oldExpireAt = jedisCluster.getSet(redisKey, expireAt);
                        if (Long.parseLong(oldExpireAt) < now) {
                            flag = true;
                            break;
                        }
                    }
                }
                if (timeoutAt < now) {
                    break;
                }
                TimeUnit.NANOSECONDS.sleep(WAIT_INTERVAL_IN_MS);
            }
            if (!flag) {
                throw new RuntimeException("canot acquire lock now ...");
            }
        } catch (JedisException je) {
            logger.error("lock", je);
            je.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("lock", e);
        }
    }

    public boolean unlock(final String redisKey) {
        try {
            jedisCluster.del(redisKey);
            return true;
        } catch (JedisException je) {
            je.printStackTrace();

            return false;
        } catch (Exception e) {
            logger.error("lock", e);
            return false;
        }

    }

    public boolean releaseLock(String lockKey, String token) {
        boolean var5;
        //使用lua脚本保证原子性
        Object result = jedisCluster.eval("if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end", Collections.singletonList(lockKey), Collections.singletonList(token));
        Long success = 1L;
        var5 = success.equals(result);
        return var5;
    }

    /**
     *  bean实例化前执行
     *
     */
    @PostConstruct
    public void cs(){
        System.out.println("aaaa");
    }


}
