package com.bridgelabz;

public class RegexMain {
    public static void main(String[] args) {
        Regex.validateFirstName("Kavya");
        Regex.validateFirstName("kavya");
        Regex.validateLastName("Ganesh");
        Regex.validateLastName("ganesh");
        Regex.validateEmail("kavyaganesh@gmail.com");
        Regex.validateEmail("kavyaganeshgmail.com");
    }
}
