package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.StudentdetailsService;
import com.example.demo.entity.StudentdetailsEntity;
import com.example.demo.repository.StudentdetailsRepo;
import java.util.List;
@Service
public class StudentdetailsServiceImpl implements StudentdetailsService{
@Autowired StudentdetailsRepo student;

  @Override
public StudentdetailsEntity PostData(StudentdetailsEntity det){
    return student.save(det);
}
}
