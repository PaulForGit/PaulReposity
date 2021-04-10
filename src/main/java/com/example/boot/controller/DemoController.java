package com.example.boot.controller;

import com.example.boot.entity.School;
import com.example.boot.entity.Student;
import com.example.boot.service.DemoService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/test")
public class DemoController {
    @Autowired
    private DemoService service;



    @RequestMapping("/add")
    public Object exec(){
        return service.setUpDB();
    }


    @RequestMapping("/all")
    public Object allSchool() {
        School school = service.allSchool();
        System.out.println(school.getStus().size());
        return school;
    }
}
