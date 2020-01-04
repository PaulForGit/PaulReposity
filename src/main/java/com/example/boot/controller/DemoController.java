package com.example.boot.controller;

import com.example.boot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoController {
    @Autowired
    private DemoService service;


    @RequestMapping("/exec")
    public Object exec(){
        return service.setUpDB();
    }
}
