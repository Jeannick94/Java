package com.jentech;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year =  scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        LocalDate birthDate =   LocalDate.of(year,month,day);
        DateTimeFormatter myBirthDay = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("My birthday is: " + birthDate.format(myBirthDay));
        
        LocalDate afterBirthDate = birthDate.plusDays(100);
        LocalDate beforeBirthDate = birthDate.minusDays(100);
        // Define a custom date format using DateTimeFormatter
        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("dd MMM yyyy");
        // Print the new date after adding 100 days
        System.out.println("100 days after your Birthday: " + afterBirthDate.format(dateFormatter1));
        System.out.println("100 days before your Birthday: " + beforeBirthDate.format(dateFormatter1));
        
        //LocalDate birthDate = LocalDate.of(1990, 5, 15);
        LocalDate currentDate1 = LocalDate.now();
        int age = calculateAge(birthDate, currentDate1);// Get the current date
        System.out.println("Age: " + age);

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

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        // Calculate the period between the birthdate and current date
        Period period = Period.between(birthDate, currentDate);

        // Get the years from the period
        int years = period.getYears();

        // Get the months from the period
        int months = period.getMonths();

        // Get the days from the period
        int days = period.getDays();

        // Adjust the age based on the months and days
        if (months < 0 || (months == 0 && days < 0)) {
              years--;
        }

        return years;
    }
}
