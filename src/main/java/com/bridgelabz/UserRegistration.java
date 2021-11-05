package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Pattern pattern;
    Matcher matcher;

    public boolean firstNameValidation (String firstName){
        String regexFirstName = "^[A-Z]{1}[a-z]{2,}$";
        pattern = Pattern.compile(regexFirstName);
        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    public boolean lastNameValidation (String lastName){
        String regexLastName = "^[A-Z]{1}[a-z]{2,}$";
        pattern = Pattern.compile(regexLastName);
        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
}
