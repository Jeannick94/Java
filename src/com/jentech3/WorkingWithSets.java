package com.jentech3;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("green"));
        balls.add(new Ball("green"));
        balls.add(new Ball("red"));
        balls.add(new Ball("yellow"));

        balls.remove(new Ball("yellow"));

        System.out.println(balls.size());

        balls.forEach(System.out::println);

    }

    record Ball(String color){}
}
