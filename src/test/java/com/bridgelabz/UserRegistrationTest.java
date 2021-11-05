package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class UserRegistrationTest {

    UserRegistration Validate = new UserRegistration();
    Scanner Sc = new Scanner(System.in);

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        boolean result = Validate.firstNameValidation("Sumit");
            Assert.assertEquals(true, result);
            System.out.println("\n First Name Is Successfully Validated");
    }
}
