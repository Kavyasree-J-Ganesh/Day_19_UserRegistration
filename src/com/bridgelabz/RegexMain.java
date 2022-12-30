package com.bridgelabz;

import java.util.Scanner;

public class RegexMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Firstname");
        String firstName = scan.nextLine();
        Regex.validateFirstName(firstName);
        System.out.println("Enter a Firstname");
        firstName = scan.nextLine();
        Regex.validateFirstName(firstName);

        System.out.println("Enter a Lastname");
        String lastName = scan.nextLine();
        Regex.validateLastName(lastName);
        System.out.println("Enter a Lastname");
        lastName = scan.nextLine();
        Regex.validateLastName(lastName);

        System.out.println("Enter Email");
        String email = scan.nextLine();
        Regex.validateEmail(email);
        System.out.println("Enter a Lastname");
        email = scan.nextLine();
        Regex.validateEmail(email);
        
    }
}
