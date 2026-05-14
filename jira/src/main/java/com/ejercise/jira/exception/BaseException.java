package com.ejercise.jira.exception;

import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{

    private Integer status; 

    public BaseException(String message, Integer status){
        super(message);
        this.status = status;
    }
}
