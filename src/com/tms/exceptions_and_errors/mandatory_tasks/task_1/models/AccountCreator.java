package com.tms.exceptions_and_errors.mandatory_tasks.task_1.models;

import com.tms.exceptions_and_errors.mandatory_tasks.task_1.exceptions.WrongLoginException;
import com.tms.exceptions_and_errors.mandatory_tasks.task_1.exceptions.WrongPasswordException;

public class AccountCreator {

    public static boolean createAccount(String login, String password, String confirmPassword) {
        if (login.length() >= 20 || login.contains(" ")) {
            try {
                throw new WrongLoginException("Login must be less than 20 characters and not contain spaces.");
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
                return false;
            }
        }

        if (password.length() >= 20 || password.contains(" ") || !isContainDigit(password)) {
            try {
                throw new WrongLoginException("The password must be less than 20 characters, contain no spaces and contain at least one number.");
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
                return false;
            }
        }

        if (!password.equals(confirmPassword)) {
            try {
                throw new WrongPasswordException("Passwords don't match");
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
                return false;
            }
        }

        System.out.println("Account created successfully.");
        return true;
    }

    private static boolean isContainDigit(String word) {
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

}
