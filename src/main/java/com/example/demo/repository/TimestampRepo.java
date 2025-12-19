package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.p
import org.springframework.stereotype.Repository;
import com.example.demo.entity.TimestampEntity;
@Repository
public interface TimestampRepo extends JpaRepository<TimestampEntity,Long>{
    @PrePersist
    public void
}