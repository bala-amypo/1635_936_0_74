package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
@RestController
public class StudentController{
    @Autowired StudentService ser;
    @PostMapping("/post")
    public StudentEntity sendDate (@Request studentEntity stu){
        return ser.PostData(stu);
    }
}