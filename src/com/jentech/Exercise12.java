package com.jentech;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        System.out.print("Please write a string: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = capitalizeString(input);
        System.out.println(output);

        String[] array = {"hello", "ola", "bye", "ciao", "nihao"};
        int length = getArraySize(array);
        System.out.println("Number of items in the array: " +length);

        String sentence = "Hello, this is a sample sentence.";

        int wordCount = countWordsInSentence(sentence);
        System.out.println("The sentence contains " + wordCount + " words.");

    }
    public static String capitalizeString(String str){
        if (str == null || str.isEmpty()) {
            return str;
        }

        // Split the first letter from the rest of the string
        String firstLetter = str.substring(0, 1).toUpperCase();
        String restOfString = str.substring(1);

        return firstLetter + restOfString;
    }

    public static int getArraySize (String[] strings){
        return strings.length;
    }

    public static int countWordsInSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        // Split the sentence into words based on spaces
        String[] words = sentence.split("\\s+");

        // Return the number of words in the sentence
        return words.length;
    }
}
