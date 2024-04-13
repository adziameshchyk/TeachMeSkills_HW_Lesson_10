package com.tms.exceptions_and_errors.mandatory_tasks.task_0.models;

import com.tms.exceptions_and_errors.mandatory_tasks.task_0.exceptions.NotBeginWith555Exception;
import com.tms.exceptions_and_errors.mandatory_tasks.task_0.exceptions.NotContainABCException;
import com.tms.exceptions_and_errors.mandatory_tasks.task_0.exceptions.NotEndsWith1a2bException;

public class DocumentHandler {

    public static String getNumberBlocks(String docNumber) {
        String[] splitDoc = docNumber.split("-");
        return splitDoc[0] + " " + splitDoc[2];
    }

    public static String getDocNumberWithEmptyLiteralBlocks(String docNumber) {
        String[] splitDoc = docNumber.split("-");
        return docNumber.replace(splitDoc[1], "   ").replace(splitDoc[3], "   ");
    }

    public static String getOnlyLettersInLowerCase(String docNumber) {
        String[] splitDoc = docNumber.split("-");
        char[] splitLastBlock = splitDoc[4].toCharArray();
        String onlyLettersString = splitDoc[1] + "/" + splitDoc[3] + "/" + splitLastBlock[1] + "/" + splitLastBlock[3];
        return onlyLettersString.toLowerCase();
    }

    public static String getOnlyLettersInUpperCase(String docNumber) {
        String[] splitDoc = docNumber.split("-");
        char[] splitLastBlock = splitDoc[4].toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(splitDoc[1]).append('/').append(splitDoc[3]).append('/').append(splitLastBlock[1]).append('/').append(splitLastBlock[3]);
        return sb.toString().toUpperCase();
    }

    public static boolean isContainsABC(String docNumber) throws NotContainABCException {
        if (docNumber.toLowerCase().contains("abc")) {
            return true;
        } else {
            throw new NotContainABCException();
        }
    }

    public static boolean isBeginsWith555(String docNumber) throws NotBeginWith555Exception {
        if (docNumber.startsWith("555")) {
            return true;
        } else {
            throw new NotBeginWith555Exception();
        }
    }

    public static boolean isEndsWith1a2b(String docNumber) throws NotEndsWith1a2bException {
        if (docNumber.endsWith("1a2b")) {
            return true;
        } else {
            throw new NotEndsWith1a2bException();
        }
    }

}