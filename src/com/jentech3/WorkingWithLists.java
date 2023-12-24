package com.jentech3;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colorsUnmodifiable = List.of(
                "Blue",
                "yellow",
                "green",
                "red"
        );
        //colorsUnmodifiable.add("red");   we cannot add to a list defined as above

        System.out.println(colorsUnmodifiable);

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("green");
        colors.add("red");
        colors.add("pink");
        colors.add("purple");
        colors.remove(0);
        System.out.println(colors.contains("red"));
        colors.removeLast();
        System.out.println(colors);
        System.out.println();


        for (String color : colors){
            System.out.println(color);
        }

        System.out.println();
        colors.forEach(System.out::println);

        System.out.println();
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
