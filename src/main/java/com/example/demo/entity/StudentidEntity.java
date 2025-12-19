package com.example.demo.entity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentidEntity{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private String id;
    private String regno;
    private String address;
}