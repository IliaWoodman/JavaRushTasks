package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Cat cat = new Cat("Vaya");

        Map<String, Cat> map = new HashMap<>();
        map.put("vasya", new Cat("vasya"));
        map.put("petya", new Cat("petya"));
        map.put("dima", new Cat("dima"));
        map.put("murz", new Cat("murz"));
        map.put("kesha", new Cat("kesha"));
        map.put("sasha", new Cat("sasha"));
        map.put("kenra", new Cat("kenra"));
        map.put("spade", new Cat("spade"));
        map.put("qwe", new Cat("qwe"));
        map.put("asshole", new Cat("asshole"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()){
            String key = pair.getKey();
            Cat value = pair.getValue();
            set.add(value);
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
