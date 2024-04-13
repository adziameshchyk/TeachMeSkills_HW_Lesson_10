package com.tms.exceptions_and_errors.mandatory_tasks.task_1.exceptions;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

//    @Override
//    public String getMessage() {
//        return "Password must"
//    }
}
