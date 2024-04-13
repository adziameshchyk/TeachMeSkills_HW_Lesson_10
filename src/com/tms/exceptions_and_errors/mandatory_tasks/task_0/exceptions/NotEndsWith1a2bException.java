package com.tms.exceptions_and_errors.mandatory_tasks.task_0.exceptions;

public class NotEndsWith1a2bException extends Exception {

    @Override
    public String getMessage() {
        return "The document does`nt end with the sequence 1a2b.";
    }

}
