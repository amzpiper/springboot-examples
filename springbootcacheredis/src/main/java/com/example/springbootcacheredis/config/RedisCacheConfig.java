package com.example.springbootcacheredis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/**
 * Redis集群缓存
 */
@Configuration
public class RedisCacheConfig {

    @Autowired
    RedisConnectionFactory connectionFactory;

    @Bean
    RedisCacheManager redisCacheManager() {
        Map<String, RedisCacheConfiguration> configurationMap = new HashMap<>();

        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
                .prefixKeysWith("sang:")
                .disableCachingNullValues()
                .entryTtl(Duration.ofMinutes(30));
        configurationMap.put("c1", redisCacheConfiguration);

        RedisCacheWriter cacheWriter = RedisCacheWriter.nonLockingRedisCacheWriter(connectionFactory);

        RedisCacheManager redisCacheManager = new RedisCacheManager(cacheWriter, RedisCacheConfiguration.defaultCacheConfig(), configurationMap);

        return redisCacheManager;
    }
}
