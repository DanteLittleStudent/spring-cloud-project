package com.springcloud.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author cuimin
 * create in 2022-05-17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Department8001Application {

    public static void main(String args[]){
        SpringApplication.run(Department8001Application.class);
    }
}
