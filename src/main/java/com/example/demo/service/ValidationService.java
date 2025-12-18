package com.example.demo.service;

import com.example.demo.entity.ValidationEntity;
import java.util.List;
public interface ValidationService{
     ValidationEntity PostData(ValidationEntity val);
    // List<ValidationEntity>getAllData();
    // String DeleteData(int id);
    ValidationEntity getData(int id);
    // ValidationEntity updateData(int id,ValidationEntity entity);
}