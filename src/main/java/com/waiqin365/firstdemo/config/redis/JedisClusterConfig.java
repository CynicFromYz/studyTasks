package com.waiqin365.firstdemo.config.redis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/11/7 18:58
 */
@Configuration
public class JedisClusterConfig {

    @Autowired
    private RedisProperties redisProperties;

    @Bean
    public JedisCluster getJedisCluster() {
        String[] serverArray = redisProperties.getClusterNodes().split(",");
        Set<HostAndPort> nodes = new HashSet<>();
        for (String ipPort : serverArray) {
            String[] ipPortPair = ipPort.split(":");
            nodes.add(new HostAndPort(ipPortPair[0].trim(), Integer.valueOf(ipPortPair[1].trim())));
        }
        return new JedisCluster(nodes, redisProperties.getCommandTimeout(), 1000, 1, redisProperties.getPassword(), new GenericObjectPoolConfig());
    }

//    @Value("${spring.redis.cluster.nodes}")
//    private String clusterNodes;
//    @Value("${spring.redis.cluster.max-redirects}")
//    private int maxRedirects;
//    @Value("${spring.redis.password}")
//    private String password;
//    @Value("${spring.redis.timeout}")
//    private int timeout;
//    @Value("${spring.redis.maxIdle}")
//    private int maxIdle;
//    @Value("${spring.redis.maxTotal}")
//    private int maxTotal;
//    @Value("${spring.redis.maxWaitMillis}")
//    private int maxWaitMillis;
//    @Value("${spring.redis.minEvictableIdleTimeMillis}")
//    private int minEvictableIdleTimeMillis;
//    @Value("${spring.redis.numTestsPerEvictionRun}")
//    private int numTestsPerEvictionRun;
//    @Value("${spring.redis.timeBetweenEvictionRunsMillis}")
//    private int timeBetweenEvictionRunsMillis;
//    @Value("${spring.redis.testOnBorrow}")
//    private boolean testOnBorrow;
//    @Value("${spring.redis.testWhileIdle}")
//    private boolean testWhileIdle;
//
//    @Bean
//    public JedisPoolConfig getJedisPoolConfig() {
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        // 最大空闲数
//        jedisPoolConfig.setMaxIdle(maxIdle);
//        // 连接池的最大数据库连接数
//        jedisPoolConfig.setMaxTotal(maxTotal);
//        // 最大建立连接等待时间
//        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
//        // 逐出连接的最小空闲时间 默认1800000毫秒(30分钟)
//        jedisPoolConfig.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
//        // 每次逐出检查时 逐出的最大数目 如果为负数就是 : 1/abs(n), 默认3
//        jedisPoolConfig.setNumTestsPerEvictionRun(numTestsPerEvictionRun);
//        // 逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1
//        jedisPoolConfig.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
//        // 是否在从池中取出连接前进行检验,如果检验失败,则从池中去除连接并尝试取出另一个
//        jedisPoolConfig.setTestOnBorrow(testOnBorrow);
//        // 在空闲时检查有效性, 默认false
//        jedisPoolConfig.setTestWhileIdle(testWhileIdle);
//        return jedisPoolConfig;
//    }
//
//    /**
//     * Redis集群的配置
//     *
//     * @return RedisClusterConfiguration
//     * @throws
//     */
//    @Bean
//    public RedisClusterConfiguration redisClusterConfiguration() {
//        RedisClusterConfiguration redisClusterConfiguration = new RedisClusterConfiguration();
//        String[] serverArray = clusterNodes.split(",");
//        Set<RedisNode> nodes = new HashSet<>();
//        for (String ipPort : serverArray) {
//            String[] ipAndPort = ipPort.split(":");
//            nodes.add(new RedisNode(ipAndPort[0].trim(), Integer.valueOf(ipAndPort[1])));
//        }
//        redisClusterConfiguration.setClusterNodes(nodes);
//        redisClusterConfiguration.setMaxRedirects(maxRedirects);
//        redisClusterConfiguration.setPassword(RedisPassword.of(password));
//        return redisClusterConfiguration;
//    }
//
//    /**
//     * @param
//     * @return
//     * @Description:redis连接工厂类
//     * @date 2018/10/25 19:45
//     */
//    @Bean
//    public JedisConnectionFactory jedisConnectionFactory() {
//        //集群模式
//        JedisConnectionFactory  factory = new JedisConnectionFactory(redisClusterConfiguration(),getJedisPoolConfig());
//        factory.setDatabase(0);
//        factory.setTimeout(timeout);
//        factory.setUsePool(true);
//        return factory;
//    }
//
//    /**
//     * 实例化 RedisTemplate 对象
//     *
//     * @return
//     */
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate() {
//        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//        initDomainRedisTemplate(redisTemplate);
//        return redisTemplate;
//    }
//
//    /**
//     * 设置数据存入 redis 的序列化方式,并开启事务
//     * 使用默认的序列化会导致key乱码
//     *
//     */
//    private void initDomainRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
//        //如果不配置Serializer，那么存储的时候缺省使用String，如果用User类型存储，那么会提示错误User can't cast to String！
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        //这个地方有一个问题，这种序列化器会将value序列化成对象存储进redis中，如果
//        //你想取出value，然后进行自增的话，这种序列化器是不可以的，因为对象不能自增；
//        //需要改成StringRedisSerializer序列化器。
//        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
//        redisTemplate.setEnableTransactionSupport(false);
//        redisTemplate.setConnectionFactory(jedisConnectionFactory());
//    }


}
