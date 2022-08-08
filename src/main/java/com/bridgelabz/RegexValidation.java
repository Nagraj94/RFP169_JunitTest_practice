package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation{

    public static void main(String[] args) throws RegexValidationExceptions {
        Scanner sc = new Scanner(System.in);
        RegexValidation regex = new RegexValidation();
            System.out.println("Enter first name: ");
            regex.firstName.validation(sc.next());
            System.out.println("Enter last name: ");
            regex.lastName.validation(sc.next());
            System.out.println("eg.abc.xyz@bl.co.in\nEnter email: ");
            regex.email.validation(sc.next());
            System.out.println("Enter mobile number");
            regex.phoneNum.validation(sc.next());
            System.out.println("Enter password");
            regex.password.validation(sc.next());


    }
    public RegexValidationInter firstName = (firstName) -> {
        Pattern name = Pattern.compile("^[A-Z]\\w{3,}$");
        Matcher matchFirstName = name.matcher(firstName);
        if (matchFirstName.matches())
            return true;
        else
            throw new RegexValidationExceptions("Invalid First name: "+ firstName);
    };
    public RegexValidationInter lastName = (lastName) -> {
        Pattern name = Pattern.compile("^[A-Z]\\w{3,}$");
        Matcher matchLastName = name.matcher(lastName);
        if (matchLastName.matches())
            return true;
        else
            throw new RegexValidationExceptions("Invali Last name: "+lastName);
    };
    public RegexValidationInter email = (email) ->{
        Pattern emailValid = Pattern.compile("^[a-zA-Z0-9]+([._-[+]][a-zA-Z0-9]+)*@([a-z1-9]+)([.][a-z]*)?(\\.[a-z]{2,})$");
        Matcher matchEmail = emailValid.matcher(email);
        if (matchEmail.matches()){
            return true;
        }
        else {
            throw new RegexValidationExceptions("Invalid email: "+email);
        }
    };
    public RegexValidationInter phoneNum = (phoneNum) -> {
        Pattern phNo = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\ -]\\s*)?|[0]?)?[789]\\d{9}|(\\d[ -]?){10}\\d$");
        Matcher matchPhone = phNo.matcher(phoneNum);
        if (matchPhone.matches()){
            return true;
        }
        else {
            throw new RegexValidationExceptions("Invalid phone number: "+phoneNum);
        }
    };
    public RegexValidationInter password  = (password) ->{
        Pattern passWord = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])+(?=.*[@#$%^&+=])+(?=.*[0-9]).{8,20}$");
        Matcher matchPassword = passWord.matcher(password);
        if (matchPassword.matches()){
            return true;
        }
        else {
            throw new RegexValidationExceptions("Invali password: ");
        }

    };
}
