package com.jentech3;

public class GenericAndMethods {
    public static void main(String[] args) {
        String[] names = {"Jean","Nick"};
        Character[] letters = {'A','B','C','D'};
        Integer[] numbers = {1,2,3,4,5,6};


        print(names);
        print(letters);
        print(numbers);

    }

    static <T> void print(T[] array){
        for (T e : array){
            System.out.println(e.getClass().getName() + " - " + e);
        }
    }
}
