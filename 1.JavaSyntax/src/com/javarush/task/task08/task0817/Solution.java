package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("ivanov","vanya");
        map.put("petrov","feya");
        map.put("petrenko","vasya");
        map.put("spilberg","vanya");
        map.put("travolta","dima");
        map.put("stalone","john");
        map.put("depp","lolal");
        map.put("scheps","dima");
        map.put("cola","vanya");
        map.put("colaqw","vanya");
    return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copyMap = new HashMap<>(map);
        for (Map.Entry<String,String>pair1 : copyMap.entrySet() ){
            String key1 = pair1.getKey();
            String value1 = pair1.getValue();
            for (Map.Entry<String, String> pair2: copyMap.entrySet()){
                String key2 = pair2.getKey();
                String value2 = pair2.getValue();
                if (!key1.equals(key2) && value1.equals(value2)){
                    removeItemFromMapByValue(map,value1);

                }
            }
        }

            //   removeItemFromMapByValue(map,"vanya");

        }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());


    }
}
