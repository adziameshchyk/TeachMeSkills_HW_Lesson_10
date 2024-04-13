package com.tms.exceptions_and_errors.mandatory_tasks.task_1.exceptions;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
//
//    @Override
//    public String getMessage() {
//        return "Login must be less than 20 characters and not contain spaces.";
//    }
}
