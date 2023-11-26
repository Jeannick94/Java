package com.jentech;

public class Exercise2 {
    public static void main(String[] args) {
        int[] numbers = {10,5,8,9,7,6};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) { // for i loop
            sum += numbers[i];
        }
        System.out.println(sum);

        int sum1 = 0;

        for (int number : numbers){ //enhanced for loop
            sum1 += number;
        }

        System.out.println(sum1);
    }
}
