package com.jentech3;

import java.util.ArrayList;

public class GenericsAndClasses {
    public static void main(String[] args) {
        Box<Phone> box = new Box();
        box.set(new Phone("Iphone"));
        System.out.println(box.get());

        Box<Letter> box2 = new Box();
        box2.set(new Letter("Jeannick"));
        System.out.println(box2.get());
    }
}
