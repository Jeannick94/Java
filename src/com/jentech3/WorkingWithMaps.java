package com.jentech3;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer,People> map = new HashMap<>();
        map.put(1,new People("Jeannick"));
        map.put(2,new People("Jean"));
        map.put(3,new People("Palmer"));
        map.put(4,new People("Umba"));
        //key must be UNIQUE otherwise it will override the existing element
        map.remove(3);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(3));
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue(new People("Palmer")));
        System.out.println(map.getOrDefault(3,new People("default")));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        System.out.println();
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " - " + x.getValue()));

        System.out.println();

        map.forEach((key, people) -> {
            System.out.println(key + " - " + people);
        });


    }
}
