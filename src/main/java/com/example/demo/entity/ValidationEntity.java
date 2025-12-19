package com.example.demo.entity;

import jakarta.persistence.Entity;
import lambok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;
@Entity
@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2, max=10,message="must be 2 to 10 character")
    private String username;
    @Email (message="Email is not valid")
    private String email;
    @Size(min=2, max=6,message="Password must be 2 to 6 character")
    @NotNull(message="Password is mandatory")
    private String password;
    @Max(30)
    @Positive(message="Age must be Positive")
    private int age;


}