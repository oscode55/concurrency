package com.mmall.concurrency.example.cache;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @Author: myname
 * @Date: 2019/2/3 4:04
 */
@Configuration
@Slf4j
public class RedisConfig {

    @Bean(name = "redisPool")
    public JedisPool jedisPool(@Value("${jedis.host}") String host,
                               @Value("${jedis.port}") int port){
        return new JedisPool(host,port);
    }
}
