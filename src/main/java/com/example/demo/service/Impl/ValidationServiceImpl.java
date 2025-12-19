package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepo;
import java.util.List;
@Service
public class ValidationServiceImpl implements ValidationService{
    @Autowired ValidationRepo Student;
     @Override
public ValidationEntity PostData(ValidationEntity val){
    return Student.save(val);
}
@Override
public ValidationEntity getData(int id){
    return Student.findById(id).orElseThrow();
}
}