package com.jentech;

public class Exercise8 {
    public static void main(String[] args) {

        String input = "Romance";
        String reversedInput = reverseString(input);
        System.out.println("Input: " + input);
        System.out.println("Reversed: " + reversedInput);

    }

    public static String reverseString(String input){
        if (input == null || input.isEmpty()){
            return input;
        }

        StringBuilder reserved = new StringBuilder();
        for (int i = input.length() - 1; i >= 0 ; i--) {
            reserved.append(input.charAt(i));
        }
        return reserved.toString();
    }
}
