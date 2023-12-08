package com.jentech;


public class EmailValidator {

    public static void main(String[] args) {
        String email1 = "user@example.com";
        String email2 = "invalid@_email";

        EmailValidator validator = new EmailValidator();
        boolean isValid1 = validator.isValidEmail(email1);
        boolean isValid2 = validator.isValidEmail(email2);

        System.out.println("Email 1 is valid: " + isValid1);
        System.out.println("Email 2 is valid: " + isValid2);
    }
    public boolean isValidEmail(String email){
        if(email == null || email.isEmpty() || !email.contains("@")){
            return false;
        }

        // Additional validation checks can be added here if needed
        return true;
    }
}
