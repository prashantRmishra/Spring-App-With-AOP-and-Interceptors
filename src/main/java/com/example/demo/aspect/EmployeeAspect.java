package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {
    @Before(value = "execution(* com.example.demo.service.EmployeeService.*(..)) and args(empName)")
    public void beforeAdvice(JoinPoint j,String empName){
        System.out.println("before Method "+j.getSignature() + " emp Name is "+empName);
    }

    @After(value = "execution(* com.example.demo.service.EmployeeService.*(..)) and args(empName)")
    public void afterAdvice(JoinPoint j,String empName){
        System.out.println("After Advice invoked for :"+j.getSignature()+" name is:"+empName);
    }

    @Around(value = "execution(* com.example.demo.service.EmployeeService.*(..)) and args(empName)")
    public void aroundAdvice(ProceedingJoinPoint j, String empName){
        System.out.println("Around advice before the method call "+j.getSignature()+" for :"+empName);
        try{
            j.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        finally{

        }
        System.out.println("around Advice after the method invocation");
    }
    
}
