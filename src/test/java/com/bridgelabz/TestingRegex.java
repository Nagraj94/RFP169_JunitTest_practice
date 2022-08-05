package com.bridgelabz;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestingRegex {
    static RegexValidation regexValidation;

    @BeforeAll
    public static void initialize(){
        regexValidation =new RegexValidation();
    }

    @Test
    public void testUser_FirstName_becameTrue() throws RegexValidationExceptions{
        boolean result = regexValidation.firstNameValidate("Abcde");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenFirstName_IsInValidShould_ThrowRegexValidationExceptions(){
        Assertions.assertThrows(RegexValidationExceptions.class, () -> regexValidation.firstNameValidate("abcde"));
    }
    @Test
    public void testUser_LastName_becameTrue() throws RegexValidationExceptions{
        boolean result = regexValidation.lastNameValidate("Abcde");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_IsInValidShould_ThrowRegexValidationExceptions(){
        Assertions.assertThrows(RegexValidationExceptions.class, () -> regexValidation.firstNameValidate("abcde"));
    }
    @Test
    public void testUser_Email_BecameTrue() throws RegexValidationExceptions{
        boolean result = regexValidation.emailValidation("Abc.def@xyz.co.in");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenUserEmail_IsInvalidShouldThrow_RegexValidationExceptions(){
        Assertions.assertThrows(RegexValidationExceptions.class, () -> regexValidation.emailValidation("xyz.co.in"));
    }
    @Test
    public void testUser_PhoneNumber_becameTrue() throws RegexValidationExceptions{
        boolean result = regexValidation.phoneValidation("+91-9845202183");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenUserPhoneNumber_IsInvalidThrow_RegexValidationExceptions(){
        Assertions.assertThrows(RegexValidationExceptions.class, () -> regexValidation.phoneValidation("9789342527"));
    }
    @Test
    public void testUser_password_BecameTrue() throws RegexValidationExceptions{
        boolean result = regexValidation.passwordValidation("Abc@2656Ed");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenUserPassword_IsInvalidThrow_RegexValidationExceptions(){
        Assertions.assertThrows(RegexValidationExceptions.class, () -> regexValidation.passwordValidation("59823AAAAe"));
    }
    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"})
    public void givenEmail_WhenValid_ShouldReturnTrue(String email) {
        Assertions.assertTrue(regexValidation.emailValidation(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"})
    public void givenEmail_WhenInValid_ShouldReturnFalse(String email) {
        Assertions.assertFalse(regexValidation.emailValidation(email));
    }
}
