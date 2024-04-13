package com.tms.exceptions_and_errors.mandatory_tasks.task_0.exceptions;

public class NotContainABCException extends Exception {

    @Override
    public String getMessage() {
        return "The document does`nt contain the sequence abc.";
    }

}
