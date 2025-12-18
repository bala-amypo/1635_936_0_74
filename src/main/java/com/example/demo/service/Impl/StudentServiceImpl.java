package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotations.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
@Autowired StudentRepo student;
    //save()
    //findAll()
    //findById()
    //deleteById()
    //ExistById()
    @Override
public StudentEntity PostData(StudentEntity Stu){
    return student.save(stu);
}
@Override
public List<StudentEntity>getAllData(){
return student.findAll();
}
}