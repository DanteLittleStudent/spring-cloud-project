package com.springcloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author cuimin
 * create in 2022-05-17
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7001ServerApplication {

    public static void main(String[] args){
        SpringApplication.run(Eureka7001ServerApplication.class);
    }
}
