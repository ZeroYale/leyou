package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: 江毅东
 * @createDate: 2020/1/27
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LeyouGoodsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeyouGoodsWebApplication.class);
    }
}
