package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.validation.Valid;

import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import java.util.List;
@RestController
public class ValidationController{
    @Autowired ValidationService ser;
    @PostMapping("/validpost")
    public ValidationEntity postval(@Valid @RequestBody ValidationEntity stu){
        return ser.PostData(stu);
    }
    @GetMapping("/gettid/{id}")
    public ValidationEntity getData(@PathVariable Long id){
        return ser.getData(id);
}
}