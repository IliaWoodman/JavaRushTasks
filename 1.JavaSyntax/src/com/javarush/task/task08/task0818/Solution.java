package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("john", 17500);
        map.put("valey", 500);
        map.put("ivanov", 700);
        map.put("dmitriemko", 47700);
        map.put("romancc", 10);
        map.put("qwer", -50);
        map.put("qwersg", 342);
        map.put("petrenko", 501);
        map.put("ASd", 499);
        map.put("kutc", 17500);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (value < 500) {
                map.remove(key);
            }
        }

    }

    public static void main(String[] args) {
/*        removeItemFromMap(createMap());
        String s = "qwe";
        System.out.println();*/
        Map<String, String> map = new HashMap<>();
        map.put("qwe", "123");
        map.put("qqwewe", "123");
        map.put("qeqwe", "123");
        map.put("qw", "123");
        map.put("qweewewe", "123");
        map.put("qwewewe", "123");

        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            list.add(key);
        }
        for(String s: list){
            System.out.println(s);
        }
    }
}