package com.aitao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 局长
 * @date: 2019/1/21 14:44
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AtItemService {
    public static void main(String[] args) {
        SpringApplication.run(AtItemService.class,args);
    }
}
