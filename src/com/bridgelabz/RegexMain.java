package com.bridgelabz;

public class RegexMain {
    public static void main(String[] args) {
        Regex.validateFirstName("Kavya");
        Regex.validateFirstName("kavya");
        System.out.println("");

        Regex.validateLastName("Ganesh");
        Regex.validateLastName("ganesh");
        System.out.println("");

        Regex.validateEmail("kavyaganesh@gmail.com");
        Regex.validateEmail("kavyaganeshgmail.com");
        System.out.println("");

        Regex.validateMobileNumber("91 9745775612");
        Regex.validateMobileNumber("919745775612");
        System.out.println("");

        Regex.validatePassword("fhfgdddgqAA$1");
        Regex.validatePassword("hhh11h#$bA");
        System.out.println("");
    }
}
