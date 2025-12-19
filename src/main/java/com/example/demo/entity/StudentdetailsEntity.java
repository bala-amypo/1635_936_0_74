package com.example.demo.entity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentdetailsEntity{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private int id;
    private String name;
    private String email;
    private String address;
}