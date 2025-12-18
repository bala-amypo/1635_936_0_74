package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NotNull;
import jakarta.persistence.Size;
import jakarta.persistence.email;
import jakarta.persistence.Max;
import jakarta.persistence.Positive;
@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @size(min=2, max=10,message="must be 2 to 10 character")
    private String username;
    @email (message="Email is not valid")
    private String email;
    @Size(min=2, max=6,message="Password must be 2 to 6 character")
    @NotNull(message="Password is mandatory")
    private String password;
    @Max(30)
    @Positive(message="Age must be Positive")
    private int age;

     public void setId(Integer id){
        this.id=id;
    }
    public Integer getId(){
        return id;
    }
    public void setName(String username){
        this.username=name;
    }
    public String getName(){
        return name;
    }
}