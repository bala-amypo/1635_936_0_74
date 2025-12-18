package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotations.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService{
    //save()
    //findAll()
    //findById()
    //deleteById()
    //ExistById()
    @Override
public StudentEntity PostData(StudentEntity Stu){
    return student.save(stu;)
}
}