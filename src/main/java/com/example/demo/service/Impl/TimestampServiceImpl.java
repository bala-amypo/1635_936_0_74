package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.TimestampService;
import com.example.demo.entity.TimestampEntity;
import com.example.demo.repository.TimestampRepo;
import java.util.List;
@Service
public class TimestampServiceImpl implements TimestampService{
@Autowired TimestampRepo student;
    @Override
public TimestampEntity PostData(TimestampEntity en){
    return student.save(en);
}
}