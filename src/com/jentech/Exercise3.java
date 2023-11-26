package com.jentech;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        String[] names = {"i", "sure", "do", "love", "bees"};

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toUpperCase();
        }
        for ( String name : names){
            System.out.println(name);
        }
    }
}
