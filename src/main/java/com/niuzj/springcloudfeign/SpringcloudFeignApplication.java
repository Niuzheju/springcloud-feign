package com.niuzj.springcloudfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
//开启声明式服务调用, 会自动开启客户端负载均衡,底层封装的还是ribbon
@EnableFeignClients(basePackages = "com.niuzj.springcloudfeign.service")
@SpringBootApplication
public class SpringcloudFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignApplication.class, args);
    }

}

