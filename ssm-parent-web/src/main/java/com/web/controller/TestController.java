package com.web.controller;

import com.service.inter.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){

        return testService.sayHello();
    }

    @GetMapping("/getAllStudents")
    @ResponseBody
    public String getAllStudents(){

        return testService.getAllStudents();
    }

}
