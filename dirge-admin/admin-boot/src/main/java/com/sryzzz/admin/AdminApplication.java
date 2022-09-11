package com.sryzzz.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Admin 模块启动类
 *
 * @author sryzzz
 * @create 2022/9/11 17:28
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
