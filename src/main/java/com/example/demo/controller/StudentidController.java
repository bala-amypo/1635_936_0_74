package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.service.StudentidService;
import com.example.demo.entity.StudentidEntity;
import java.util.List;
@RestController
public class StudentidController{
    @Autowired StudentidService ser;
    @PostMapping("/post")
    public StudentidEntity sendData (@RequestBody StudentidEntity stu){
        return ser.PostData(stu);
    }
}