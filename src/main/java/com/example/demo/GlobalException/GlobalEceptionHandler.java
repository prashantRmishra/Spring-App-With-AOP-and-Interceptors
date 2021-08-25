package com.example.demo.GlobalException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.Exceptions.UserNotFoudException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class GlobalEceptionHandler  extends ResponseEntityExceptionHandler{
    @ExceptionHandler(UserNotFoudException.class)
    public final ResponseEntity<Object> handleUserNotFoundException(UserNotFoudException ex,WebRequest re){
        ExceptionBean e  = new ExceptionBean(new Date(),"User Does Not Exist",re.getDescription(false));
        return new ResponseEntity<Object>(e, HttpStatus.NOT_FOUND);
    }
}
