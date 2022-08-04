package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegexValidation regex = new RegexValidation();
            System.out.println("Enter first name: ");
            String firstName = sc.next();
            System.out.println("Enter last name: ");
            String lastname = sc.next();
            System.out.println("eg.abc.xyz@bl.co.in\nEnter email: ");
            String emailValid = sc.next();
            System.out.println("Enter mobile number");
            String phoneNo = sc.next();
            System.out.println("Enter password");
            String passWord = sc.next();
            regex.firstNameValidate(firstName);
            regex.lastNameValidate(lastname);
            regex.emailValidation(emailValid);
            regex.phoneValidation(phoneNo);
            regex.passwordValidation(passWord);
        System.out.println("\nValid Emails: ");
        String[] validEmail={"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
        for (String s : validEmail) {
            regex.emailValidation(s);
        }

        System.out.println("\nInValid Emails: ");
        String[] inValidEmail={"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};
        for (String s : inValidEmail) {
            regex.emailValidation(s);
        }

    }
    public boolean firstNameValidate(String firstName){
        Pattern name = Pattern.compile("^[A-Z]\\w{3,}$");
        Matcher matchFirstName = name.matcher(firstName);
        if (matchFirstName.matches())
            System.out.println("Is Valid");
        else
            System.out.println("Is not valid");


        return matchFirstName.matches();
    }
    public boolean lastNameValidate(String lastName){
        Pattern name = Pattern.compile("^[A-Z]\\w{3,}$");
        Matcher matchLastName = name.matcher(lastName);
        if (matchLastName.matches())
            System.out.println("Is Valid");
        else
            System.out.println("Is not valid");
        return matchLastName.matches();
    }
    public boolean emailValidation(String email){
        Pattern emailValid = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
        Matcher matchEmail = emailValid.matcher(email);
        if (matchEmail.matches()){
            System.out.println("Email is Valid");
        }
        else {
            System.out.println("Email is not Valid");
        }
        return matchEmail.matches();
    }
    public boolean phoneValidation(String phoneNum){
        Pattern phNo = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\ -]\\s*)?|[0]?)?[789]\\d{9}|(\\d[ -]?){10}\\d$");
        Matcher matchPhone = phNo.matcher(phoneNum);
        if (matchPhone.matches()){
            System.out.println("Phone number is valid");
        }
        else {
            System.out.println("enter valid phone number");
        }
        return matchPhone.matches();
    }
    public boolean passwordValidation(String password){
        Pattern passWord = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])+(?=.*[@#$%^&+=])+(?=.*[0-9]).{8,20}$");
        Matcher matchPassword = passWord.matcher(password);
        if (matchPassword.matches()){
            System.out.println("Password is valid");
        }
        else {
            System.out.println("Password should contain atleast 8 character, 1 uppercase,1 lowercase, 1 number, 1 special character");
        }
        return matchPassword.matches();
    }
}
