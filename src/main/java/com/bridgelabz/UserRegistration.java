package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {


    // Method for First Name Validation
    public static boolean firstNameValidation(String firstName) throws UserRegistrationException{
        if (firstName == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (firstName.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        {
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(firstName);
            return matcher.matches();
        }
    }

    // Method for Last Name Validation
    public static boolean lastNameValidation(String lastName) throws UserRegistrationException{
        if (lastName == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (lastName.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        {
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(lastName);
            return matcher.matches();
        }
    }

    // Method for Email ID Validation
    public static boolean emailIdValidation(String emailId) throws UserRegistrationException {
        if (emailId == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (emailId.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regexEmailId = "^[A-Z a-z 1-9]+([.][A-Z a-z 1-9]+)*@[A-Z a-z]{3,5}+.[a-z]{2,3}+([.][a-z]{2})*$";
        Pattern pattern = Pattern.compile(regexEmailId);
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    }


    // Method for Phone Number Validation
    public static boolean phoneNoValidation(String phoneNo) throws UserRegistrationException {
        if (phoneNo == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (phoneNo.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regexPhoneNo = "^[+][0-9]{2}\\s[0-9]{10}$";
        Pattern pattern = Pattern.compile(regexPhoneNo);
        Matcher matcher = pattern.matcher(phoneNo);
        return matcher.matches();
    }

    // Method for Password Validation
    public static boolean passwordValidation(String password) throws UserRegistrationException {
        if (password == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regexPassword = "^[A-Z]{1,}[A-Z a-z]{8,}[!@#$%^*_+=]{1}[0-9]{1,}$";
        Pattern pattern = Pattern.compile(regexPassword);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}

