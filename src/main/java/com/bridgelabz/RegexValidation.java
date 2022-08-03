package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first name: ");
            String firstName = sc.next();
            System.out.println("Enter last name: ");
            String lastname = sc.next();
            System.out.println("eg.abc.xyz@bl.co.in\nEnter email: ");
            String emailValid = sc.next();
            firstNameLastnameValidate(firstName,lastname);
            emailValidation(emailValid);
        }
    }
    public static void firstNameLastnameValidate(String firstName, String lastName){
        Pattern name = Pattern.compile("^[A-Z]\\w{3,}$");
        Matcher matchFirstName = name.matcher(firstName);
        Matcher matchLastName = name.matcher(lastName);
        if (matchFirstName.matches() && matchLastName.matches()){
            System.out.println("Valid");
        }
        else {
            System.out.println("first letter should start with capital");
        }
    }
    public static void emailValidation(String email){
        Pattern emailValid = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
        Matcher matchEmail = emailValid.matcher(email);
        if (matchEmail.matches()){
            System.out.println("Email is Valid");
        }
        else {
            System.out.println("Email is not Valid");
        }
    }

}
