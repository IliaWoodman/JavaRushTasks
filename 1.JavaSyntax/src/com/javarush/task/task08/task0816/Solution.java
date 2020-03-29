package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("JUNE 3 2012"));  /////
        map.put("Петров", dateFormat.parse("MAY 15 2012"));
        map.put("Сидоров", dateFormat.parse("JULY 26 2012")); ////
        map.put("Березуцкий", dateFormat.parse("MAY 9 2012"));
        map.put("Солтыков", dateFormat.parse("AUGUST 5 2012"));  ///
        map.put("Дойц", dateFormat.parse("JUNE 3 2012"));
        map.put("Швой", dateFormat.parse("OCTOBER 3 2012"));
        map.put("Каргаман", dateFormat.parse("MAY 3 2012"));
        map.put("Зануда", dateFormat.parse("JULY 3 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy = new HashMap<>(map);
        for (Map.Entry<String, Date> pair : copy.entrySet()) {
            String key = pair.getKey();
            Date value = pair.getValue();
            if (value.getMonth() >= 5 && value.getMonth() <= 7) {
                map.remove(key);
            }
        }

    }


    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople(createMap());
    }
}
