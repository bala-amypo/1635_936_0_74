package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import java.util.List;
@RestController
public class ValidationController{
    @Autowired ValidationService ser;
}