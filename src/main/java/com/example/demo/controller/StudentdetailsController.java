package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
// import jakarta.validation.Valid;

import com.example.demo.service.StudentdetailsService;
import com.example.demo.entity.StudentdetailsEntity;
import java.util.List;
@RestController
public class StudentdetailsController{
    @Autowired StudentdetailsService ser;
    @PostMapping("/Timepost")
    public StudentdetailsEntity postval(@RequestBody StudentdetailsEntity stu){
        return ser.PostData(stu);
    }
}