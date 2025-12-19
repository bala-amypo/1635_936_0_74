package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.service.StudentdetailsService;
import com.example.demo.entity.StudentdetailsEntity;
import java.util.List;
@RestController
public class StudentdetailsController{
    @Autowired StudentdetailsService ser;
    @PostMapping("/post")
    public StudentdetailsEntity postData (@RequestBody StudentdetailsEntity stu){
        return ser.PostData(stu);
    }
}