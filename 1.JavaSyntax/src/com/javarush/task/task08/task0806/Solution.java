package com.javarush.task.task08.task0806;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Коллекция Map из Object
*/

public class Solution {
    public static void main(String[] args) {
/*
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //напишите тут ваш код
        for (Map.Entry<String , Object> pair : map.entrySet()){
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + " - " + value);
        }
*/
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(2);
        yearStartTime.setMonth(0);

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msTimeDistance/msDay);
        System.out.println("Days from start of year: " + dayCount);

    }
}
