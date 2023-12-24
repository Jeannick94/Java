package com.jentech3;

public class BoundedTypeParameter {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6};
        System.out.println(countGreaterThan(numbers,2));

        Double[] numbers1 = {1.0,2.0,3.6,4.4,5.7,6.9};
        System.out.println(countGreaterThan(numbers1,2.0));


    }

    static <T extends Comparable<T>>int countGreaterThan(T[] numbers, T number){
        int count = 0;

        for (T n : numbers){
            if (n.compareTo(number) > 0){
                count++;
            }
        }

        return count;

    }
}
