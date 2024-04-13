package com.tms.exceptions_and_errors.mandatory_tasks.task_1;

import com.tms.exceptions_and_errors.mandatory_tasks.task_1.models.AccountCreator;

/**
 * Task:
 *
 * Create a class that will have a static method
 * (read and understand how a static method differs from a non-static method - discuss in class if necessary).
 * This method takes three parameters as input:
 * -login
 * -password
 * -confirmPassword
 * All fields are of String data type.
 * Login must be less than 20 characters long and must not contain spaces.
 * If login does not meet these requirements, a WrongLoginException must be thrown.
 * Password must be less than 20 characters long, must not contain spaces, and must contain at least one number.
 * Also, password and confirmPassword must be equal.
 * If the password does not meet these requirements, a WrongPasswordException must be thrown.
 * WrongPasswordException and WrongLoginException are custom exception classes with two constructors - one by default,
 *    the second takes the exception message and passes it to the constructor of the Exception class.
 * The method returns true if the values are true or false otherwise.
 */

public class Runner {

    public static void main(String[] args) {
        AccountCreator.createAccount("login", "password1", "password1");
    }

}
