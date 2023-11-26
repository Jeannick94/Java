package com.jentech;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Exercise5 {
    public static void main(String[] args) {
        String[] content = {"you", "are", "how", "hello"};
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        // Reverse the array using a for loop
        for (int i = content.length - 1; i >= 0; i--) {
            System.out.print(content[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }

        System.out.print("?");

    }
}
