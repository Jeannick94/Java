package com.jentech3;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UpperBoundedWildcards {
    public static void main(String[] args) {
        // ? wildcards
        // unbounded Wildcards
        List<Object> list = Arrays.asList("1",2,new Date());
        List<Integer> list1 = Arrays.asList(1,2);
        List<String> list2 = Arrays.asList("1","2");

        System.out.println();
        System.out.println("unbounded Wildcards: everything");
        print(list);
        print(list1);
        print(list2);

        System.out.println();
        System.out.println("Upper bounded Wildcards: class with its subclass");

        // Upper bounded Wildcards
        List<Double> list3 = Arrays.asList(1.9,4.7);
        List<Integer> list4 = Arrays.asList(1,2);
        List<Number> list5 = Arrays.asList();
        printNumber(list3);
        printNumber(list4);
        printNumber(list5);

        System.out.println();
        System.out.println("Lower bounded Wildcards: class with its superclass");

        // Lower bounded Wildcards
        List<Integer> list6 = Arrays.asList(1,2);
        List<Number> list7 = Arrays.asList();
        printInteger(list6);
        printInteger(list7);


    }

    static void print(List<?> list){
        list.forEach(e -> {
            System.out.println(e.getClass().getName() + " - " + e);
        });
    }

    static void printNumber(List<? extends Number> list){
        list.forEach(e -> {
            System.out.println(e.getClass().getName() + " - " + e);
        });
    }

    static void printInteger(List<? super Integer> list){
        list.forEach(e -> {
            System.out.println(e.getClass().getName() + " - " + e);
        });
    }
}
