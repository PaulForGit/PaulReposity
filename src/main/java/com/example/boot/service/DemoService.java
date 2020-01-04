package com.example.boot.service;

import com.example.boot.dao.SchoolDao;
import com.example.boot.dao.StudentDao;
import com.example.boot.entity.School;
import com.example.boot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoService {
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private SchoolDao schoolDao;

    @Transactional(rollbackFor = RuntimeException.class)
    public String setUpDB(){
        //school save
        School sch = new School();
        sch.setSchName("qinghua");
        sch.setSchAdress("BeiJing");
        schoolDao.save(sch);

        Student stu1 = new Student();
        stu1.setStuName("jack");
        stu1.setSch(sch);
        studentDao.save(stu1);
        Student stu2 = new Student();
        stu2.setStuName("tom");
        stu2.setSch(sch);
        studentDao.save(stu2);
        Student stu3 = new Student();
        stu3.setStuName("alice");
        stu3.setSch(sch);
        studentDao.save(stu3);
        return "success";
    }

}
