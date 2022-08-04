package com.bridgelabz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestingRegex {
    static RegexValidation regexValidation;

    @BeforeAll
    public static void initialize(){
        regexValidation =new RegexValidation();
    }
    @Test
    public void testUser_FirstName_becameTrue(){
        boolean result = regexValidation.firstNameValidate("Abcde");
        Assertions.assertTrue(result);
    }
    @Test
    public void testUser_LastName_becameTrue(){
        boolean result = regexValidation.lastNameValidate("Abcde");
        Assertions.assertTrue(result);
    }
    @Test
    public void testUser_Email_BecameTrue(){
        boolean result = regexValidation.emailValidation("Abc.def@xyz.co.in");
        Assertions.assertTrue(result);
    }
    @Test
    public void testUser_PhoneNumber_becameTrue(){
        boolean result = regexValidation.phoneValidation("+91-9845202183");
        Assertions.assertTrue(result);
    }
    @Test
    public void testUser_password_BecameTrue(){
        boolean result = regexValidation.passwordValidation("Abc@2656Ed");
        Assertions.assertTrue(result);
    }
}
