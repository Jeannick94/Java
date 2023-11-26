package com.jentech;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0.0;

        // Convert the string to an array of numbers
        String[] numbers = input.split(", ");

        System.out.println(Arrays.toString(numbers));

        // Loop through the array and convert each string to a double and add to the result
        for (String numberStr : numbers) {
            double num = Double.parseDouble(numberStr);
            result += num;
        }

        System.out.println("Total amount: " + result);
    }
}
