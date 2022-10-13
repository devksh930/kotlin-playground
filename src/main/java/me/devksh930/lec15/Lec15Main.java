package me.devksh930.lec15;

import java.util.*;

public class Lec15Main {
    public static void main(String[] args) {
        int[] array = {100, 200};

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s %s", i, array[i]);
        }

        final List<Integer> numbers = Arrays.asList(100, 200);

        //jdk8
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "MONDAY");
        map.put(2, "TUESDAY");
        //jdk9 이상
        Map.of(1, "MONDAY", 2, "TUESDAY");

        //키를 통해서 접근
        for (int key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
        //entry를(key,value)를 가지는 객체를 이용함
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}

