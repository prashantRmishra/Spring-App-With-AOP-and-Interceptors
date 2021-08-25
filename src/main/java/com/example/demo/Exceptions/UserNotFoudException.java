package com.example.demo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)  /// common exception handling for not found resources
public class UserNotFoudException extends RuntimeException {
    public UserNotFoudException(String msg){
        super(msg);
    }
}
