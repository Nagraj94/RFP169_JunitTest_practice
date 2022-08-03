package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = sc.next();
        firstNameValidate(firstName);

    }
    public static void firstNameValidate(String firstName){
        Pattern name = Pattern.compile("^[A-Z]\\w{3,}$");
        Matcher matchFirstName = name.matcher(firstName);
        if (matchFirstName.matches()){
            System.out.println("Valid");
        }
        else {
            System.out.println("first letter should start with capital");
        }


    }
}
