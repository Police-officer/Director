package com.aitao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 局长
 * @date: 2019/1/20 22:16
 */
@SpringBootApplication
@EnableEurekaClient
public class AtRegistry {
    public static void main(String[] args) {
        SpringApplication.run(AtRegistry.class,args);
    }
}
