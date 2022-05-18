package com.springcloud.staff.controller;

import com.springcloud.common.bean.ControllerResultInfo;
import com.springcloud.common.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author cuimin
 * create in 2022-05-17
 */
@RestController
@EnableEurekaClient
public class StaffController extends BaseController {
    @Autowired
    private RestTemplate restTemplate;

    private final static String DEPARTMENT_URL = "http://DEPT-APPLICATION";

    @RequestMapping("/staff/get/all")
    public ControllerResultInfo findDepartments(){
        ControllerResultInfo controllerResultInfo = new ControllerResultInfo();
        try {
            controllerResultInfo =  restTemplate.getForObject(DEPARTMENT_URL + "/department/get/all", ControllerResultInfo.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return controllerResultInfo;
    }
}

