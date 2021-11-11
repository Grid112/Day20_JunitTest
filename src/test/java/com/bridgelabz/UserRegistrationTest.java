package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration Validate = new UserRegistration();

    // Test for First Name Validation And Exception Handling
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = UserRegistration.firstNameValidation.validate("Sumit");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        try {
            boolean result = UserRegistration.firstNameValidation.validate("sumit");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_null_ShouldThrowUserRegistrationException() {
        try {
            UserRegistration.firstNameValidation.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            UserRegistration.firstNameValidation.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    // Test for Last Name Validation And Exception Handling
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = UserRegistration.lastNameValidation.validate("Ware");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = UserRegistration.lastNameValidation.validate("ware");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_null_ShouldThrowUserRegistrationException() {
        try {
            UserRegistration.lastNameValidation.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            UserRegistration.lastNameValidation.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    // Test for Email ID Validation And Exception Handling
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = UserRegistration.emailIdValidation.validate("abc@yahoo.com");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = UserRegistration.emailIdValidation.validate("abc()*@gmail.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmailId_null_ShouldThrowUserRegistrationException() {
        try {
            UserRegistration.emailIdValidation.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenEmailId_emptyString_ShouldThrowUserRegistrationException() {
        try {
            boolean result = UserRegistration.emailIdValidation.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    // Test for Phone Number Validation And Exception Handling
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = UserRegistration.phoneNoValidation.validate("+91 7844999888");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = UserRegistration.phoneNoValidation.validate("91 7844999888");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_null_ShouldThrowUserRegistrationException() {
        try {
            UserRegistration.phoneNoValidation.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_emptyString_ShouldThrowUserRegistrationException() {
        try {
            UserRegistration.phoneNoValidation.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }


    // Test for Password Validation And Exception Handling
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = UserRegistration.passwordValidation.validate("Sumitware@1999");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = UserRegistration.passwordValidation.validate("@@@@@@@@@A");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_null_ShouldThrowUserRegistrationException() {
        try {
            UserRegistration.passwordValidation.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_emptyString_ShouldThrowUserRegistrationException() {
        try {
            UserRegistration.passwordValidation.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }
}
