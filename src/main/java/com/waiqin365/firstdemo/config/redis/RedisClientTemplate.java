//package com.waiqin365.firstdemo.config.redis;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
///**
// * @author cynic
// * @version 1.0
// * @createTime 2019/11/7 19:05
// */
//@Component
//public class RedisClientTemplate {
//
//    private static Logger logger = LoggerFactory.getLogger(RedisClientTemplate.class);
//
//    private static final Logger log = LoggerFactory.getLogger(RedisClientTemplate.class);
//
//    @Autowired
//    private JedisClusterConfig jedisClusterConfig;
//
//    public boolean setValue(String key, Object value) {
//        try {
//            String str = jedisClusterConfig.getJedisCluster().set(key, String.valueOf(value));
//            if ("OK".equals(str))
//                return true;
//        } catch (Exception ex) {
//            log.error("setToRedis:{Key:" + key + ",value" + value + "}", ex);
//        }
//        return false;
//    }
//
//    public Object getValue(String key) {
//        String str = null;
//        try {
//            str = jedisClusterConfig.getJedisCluster().get(key);
//        } catch (Exception ex) {
//            log.error("getRedis:{Key:" + key + "}", ex);
//        }
//        return str;
//    }
//
//}
