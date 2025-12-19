package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;


public class ValidationException extends RuntimeException{

    public ValidationException(String message){
        super(message);
    }
}