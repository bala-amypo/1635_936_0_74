package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;
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

     public void setId(Long id){
        this.id=id;
    }
    public Integer getId(){
        return id;
    }
    public void setUserName(String username){
        this.username=username;
    }
    public String getUserName(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
     public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
     public void setAge(Int age){
        this.age=age;
    }
    public Int getAge(){
        return age;
    }
    public ValidationEntity(Long id,
     @NotNull @size(min=2, max=10,message="must be 2 to 10 character") String username,
     @email (message="Email is not valid") String email,
     @Size(min=2, max=6,message="Password must be 2 to 6 character")
    @NotNull(message="Password is mandatory") String password,
    @Max(30) @Positive(message="Age must be Positive") int age){
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.age=age;
    }
    public ValidationEntity(){

    }
}