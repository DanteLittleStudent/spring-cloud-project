package com.springcloud.dept.controller;


import com.springcloud.common.bean.ControllerResultInfo;
import com.springcloud.common.controller.BaseController;
import com.springcloud.common.dto.DepartmentDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cuimin
 * create in 2022-05-16
 */
@RestController
public class DepartmentController extends BaseController {

    @Value("${server.port}")
    private  String port;

    @RequestMapping("/department/add")
    public ResponseEntity<Object> createDepartment(@RequestBody DepartmentDTO departmentDTO){
        return new ResponseEntity<>(new ControllerResultInfo(true, HttpStatus.OK.value(), "", null), HttpStatus.OK);
    }

    @RequestMapping("/department/get/all")
    public ControllerResultInfo findDepartments(){
        System.out.println("端口号：" + port);
        return new ControllerResultInfo(HttpStatus.OK.value(), "成功了！" + "端口号：" + port);
    }
}
