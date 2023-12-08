package com.jentech;

import java.awt.*;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] alphabet = {"a","b","c","d"};
        System.out.println(Arrays.toString(alphabet));

        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i]);
        }

        String[] alphabet1 = alphabet;
        alphabet1[0] = "z";

        System.out.println(Arrays.toString(alphabet));
        System.out.println(Arrays.toString(alphabet1));

        System.out.println("Switch:");
        int day = 6;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please select a value between 1 and 7");
        }

        String result = switch (day){ // store the result of the first switch case into a variable
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Please select a value between 1 and 7";
        };
        System.out.println(result.toUpperCase()); //I can modify this as i want such as toUpperCase ...
        System.out.println(result.length());

        char grade = 'A';
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
        }

        int resultGrade = switch (grade){ // store the result of the first switch (grade) case into a variable
            case 'A' -> 1;
            case 'B','C' -> 2;
            default -> 3;
        };
        System.out.println(resultGrade);

        TshirtSize size = TshirtSize.XXL;
        System.out.println("Selected t-shirt size: " + size);
    }
}