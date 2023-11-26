package com.jentech;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        System.out.println("Please enter two number: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        boolean comparison = areNumbersEqual(num1,num2);
        String larger = compareTwoNumbers(num1,num2);
        int addition = sum(num1,num2);
        System.out.println("The sum of " +num1 + " and " + num2 + " is " +addition);
        System.out.println(num1 + " and " + num2 + " are equal: " + comparison);
        int neg = negate(addition);
        System.out.println("Negation of " +addition+ " is " +neg);
        System.out.println(larger);



    }

    public static int sum (int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public static int negate (int a){
        return -a;
    }

    public static boolean areNumbersEqual (int numberOne, int numberTwo){
        return numberOne == numberTwo;
    }

    public static String compareTwoNumbers(int numberOne, int numberTwo){
        if (numberOne > numberTwo){
            return "The first number is larger";
        } else if (numberOne < numberTwo) {
            return "The second number is larger";
        } else {
            return "The numbers are equal";
        }
    }
}
