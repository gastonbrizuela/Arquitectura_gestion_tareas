package com.ejercise.jira.exception;

public class ConflictException extends BaseException {

    public ConflictException(String message){

        super(message, 409);  
        
    }
}
