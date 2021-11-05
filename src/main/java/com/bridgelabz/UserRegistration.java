package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Pattern pattern;
    Matcher matcher;

    // Method for First Name Validation
    public boolean firstNameValidation (String firstName){
        String regexFirstName = "^[A-Z]{1}[a-z]{2,}$";
        pattern = Pattern.compile(regexFirstName);
        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    // Method for Last Name Validation
    public boolean lastNameValidation (String lastName){
        String regexLastName = "^[A-Z]{1}[a-z]{2,}$";
        pattern = Pattern.compile(regexLastName);
        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    // Method for Email ID Validation
    public boolean emailIdValidation (String emailId){
        String regexEmailId = "^[A-Z a-z 1-9]+([.][A-Z a-z 1-9]+)*@[A-Z a-z]{3,5}+.[a-z]{2,3}+([.][a-z]{2})*$";
        pattern = Pattern.compile(regexEmailId);
        matcher = pattern.matcher(emailId);
        return matcher.matches();
    }
}
