package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.example.demo.entity.StudentidEntity;
@Repository
public interface StudentidRepo extends JpaRepository<StudentidEntity,Integer>{

}