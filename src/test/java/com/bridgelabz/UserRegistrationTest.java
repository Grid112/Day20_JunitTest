package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class UserRegistrationTest {

    UserRegistration Validate = new UserRegistration();
    Scanner Sc = new Scanner(System.in);

    // Test for First Name Validation
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        boolean result = Validate.firstNameValidation("Sumit");
            Assert.assertEquals(true, result);
            System.out.println("\n First Name Is Successfully Validated");
    }

    // Test for Last Name Validation
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        boolean result = Validate.firstNameValidation("Ware");
        Assert.assertEquals(true, result);
        System.out.println(" Last Name Is Successfully Validated");
    }

    // Test for Email ID Validation
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue(){
        boolean result = Validate.emailIdValidation("Sumitware1999@gmail.com");
        Assert.assertEquals(true, result);
        System.out.println(" Email ID is Successfully Validated ");
    }
}
