package com.springcloud.staff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cuimin
 * create in 2022-05-17
 */
@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClient(name = "DEPT-APPLICATION", configuration = MyRule.class)
public class StaffApplication {

    public static void main(String args[]){
        SpringApplication.run(StaffApplication.class);
    }
}
