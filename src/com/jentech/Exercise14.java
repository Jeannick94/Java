package com.jentech;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercise14 {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        LocalTime currentTime = LocalTime.now();

        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define a custom date and time format using DateTimeFormatter
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Print current time
        System.out.println("current's Time: " + currentTime.format(timeFormatter));

        // Print today's date
        System.out.println("Today's Date: " + currentDate.format(dateFormatter));

        // Print today's date and time
        System.out.println("Current Date and Time: " + currentDateTime.format(dateTimeFormatter));
    }
}
