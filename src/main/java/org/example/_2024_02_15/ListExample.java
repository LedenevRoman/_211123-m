package org.example._2024_02_15;

import org.example._2024_02_01.Person;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("Alex1", 300.0);
        map.put("Alex2", 400.0);
        map.put("Alex3", 500.0);
        map.put("Alex4", 600.0);

        Set set = map.entrySet();

        System.out.println(map);

        for (Object object : set) {
            Map.Entry entry = (Map.Entry) object;
            Double value = (Double) entry.getValue();
            map.put(entry.getKey(), value * 1.10);
        }

        System.out.println(map);
    }
}
