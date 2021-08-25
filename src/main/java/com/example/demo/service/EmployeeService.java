package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    

    public void getAllEmpDetailsMethodCAlled(String empName){
        System.out.println("Hi I am in EmployeeService Class file");
    }
    public void anthoerTemporaryMethod(){
        System.out.println("Temporary Method Invoked");
    }
}
