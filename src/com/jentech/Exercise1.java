package com.jentech;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int[] numberArray = new int[11];

        for (int i = 0; i <= 10; i++) {
            numberArray[i] = i;
        }

        // Print the array
        System.out.println("Array contents:");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Element at index " + i + ": " + numberArray[i]);
        }


    }
}
