package com.jentech;

public class Exercise4 {
    public static void main(String[] args) {
        String[] words = {"i", "sure", "do", "love", "bees"};

        // Capitalize each word in the array
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // Capitalize the first letter and keep the rest unchanged
            words[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1);
        }

        // Print the contents of the new array
        System.out.println("Capitalized Array Words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
