package com.aitao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author: 局长
 * @date: 2019/1/21 13:58
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class AtApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(AtApiGateway.class,args);
    }
}
