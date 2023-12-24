package com.jentech3;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "blue";
        colors[1] = "green";
        colors[2] = "red";

        System.out.println(Arrays.toString(colors));

        int[] numbers = {10,20,30,40,50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        for (int number: numbers){
            System.out.println(number);
        }

        System.out.println();

        for (String color: colors){
            System.out.println(color);
        }

    }
}
