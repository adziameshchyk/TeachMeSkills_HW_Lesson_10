package com.tms.exceptions_and_errors.mandatory_tasks.task_0.exceptions;

public class NotBeginWith555Exception extends Exception {

    @Override
    public String getMessage() {
        return "The document does`nt begin with the sequence 555.";
    }

}
