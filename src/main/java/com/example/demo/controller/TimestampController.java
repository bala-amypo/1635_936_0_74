package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
// import jakarta.validation.Valid;

import com.example.demo.service.TimestampService;
import com.example.demo.entity.TimestampEntity;
import java.util.List;
@RestController
public class TimestampController{
    @Autowired TimestampService ser;
    @PostMapping("/Timepost")
    public TimestampEntity postval(@RequestBody TimestampEntity stu){
        return ser.PostData(stu);
    }
}