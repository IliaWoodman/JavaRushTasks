package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш
        Map<String, String> map = new HashMap<>();
        map.put("er","олег");
        map.put("а","евгений");
        map.put("егоров","дмитрий");
        map.put("иванов","олег");
        map.put("крстич","олег");
        map.put("б","евгений");
        map.put("aу","олег");
        map.put("aу3","евгений");
        map.put("апп","олег");
        map.put("аи","евгений");
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for(Map.Entry<String, String> pair : map.entrySet()){
            String value = pair.getValue();
            if (value.equals(name)){
               count = count + 1;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if (key.equals(lastName)){
                count = count + 1;
            }
        }
/*        for (Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            if (lastName.equals(key)){
                count = count + 1;
            }
        }*/
        return count;
    }

    public static void main(String[] args) {
        getCountTheSameFirstName(createMap(), "олег");
        getCountTheSameLastName(createMap(), "аыыывапп");
    }
}
