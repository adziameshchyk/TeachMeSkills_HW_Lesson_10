package com.tms.exceptions_and_errors.mandatory_tasks.task_0;

import com.tms.exceptions_and_errors.mandatory_tasks.task_0.exceptions.NotBeginWith555Exception;
import com.tms.exceptions_and_errors.mandatory_tasks.task_0.exceptions.NotContainABCException;
import com.tms.exceptions_and_errors.mandatory_tasks.task_0.exceptions.NotEndsWith1a2bException;
import com.tms.exceptions_and_errors.mandatory_tasks.task_0.models.DocumentHandler;

import java.util.Scanner;

/**
 * Task:
 *
 * Complete task 0 from the previous lesson.
 * Now you need to create your own exception classes for each situation:
 *
 *  - Check whether the document number contains the sequence abc.
 *  - Check whether the document number begins with the sequence 555.
 *  - Check whether the document number ends with the sequence 1a2b.
 *
 * If the document number does not satisfy the condition, then throw an exception.
 * In the class method in which these methods will be called to demonstrate the work,
 * catch the exception with a try-catch construct and in the catch block display a message for the user (message to the console).
 *
 */
public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String docNumber = scanner.nextLine();
        scanner.close();
//        String docNumber = "5551-Hdj-0813-abC-7H3j";

//        Display the first two blocks of 4 digits on one line
        System.out.println(DocumentHandler.getNumberBlocks(docNumber));

//        Display the document number, but replace blocks of three letters with " "(each letter will be replaced with " ")
        System.out.println(DocumentHandler.getDocNumberWithEmptyLiteralBlocks(docNumber));

//        Display only one letter from the document number in the format yyy/yyy/y/y in lowercase
        System.out.println(DocumentHandler.getOnlyLettersInLowerCase(docNumber));

//        Display the letters from the document number in the format "Letters:yyy/yyy/y/y" in uppercase (implemented using the StringBuilder class)
        System.out.println(DocumentHandler.getOnlyLettersInUpperCase(docNumber));

//        Check whether the document number contains the sequence abc and whether the message contains it or not (and abc and ABC are considered the same sequence).
        try {
            DocumentHandler.isContainsABC(docNumber);
            System.out.println("The document contains the sequence abc.");
        } catch (NotContainABCException e) {
            System.out.println(e.getMessage());
        }

//        Check if the document number begins with the sequence 555.
        try {
            System.out.println("The document " + (DocumentHandler.isBeginsWith555(docNumber) ? "begins" : "doesn`t begin") + " with the sequence 555.");
        } catch (NotBeginWith555Exception e) {
            System.out.println(e.getMessage());
        }

//        Check whether the document number ends with the sequence 1a2b.
        try {
            System.out.println("The document " + (DocumentHandler.isEndsWith1a2b(docNumber) ? "ends" : "doesn`t end") + " with the sequence 1a2b.");
        } catch (NotEndsWith1a2bException e) {
            System.out.println(e.getMessage());
        }

    }

}