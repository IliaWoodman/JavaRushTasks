package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.

*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Map<String, String> newMap = new HashMap<String, String>();
        newMap.put("арбуз", "ягода");
        newMap.put("банан", "трава");
        newMap.put("вишня", "ягода");
        newMap.put("груша", "фрукт");
        newMap.put("дыня", "овощ");
        newMap.put("ежевика", "куст");
        newMap.put("жень-шень", "корень");
        newMap.put("земляника", "ягода");
        newMap.put("ирис", "цветок");
        newMap.put("картофель", "клубень");

/*        Iterator<Map.Entry<String, String>> iterator = newMap.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }*/

    for (Map.Entry<String, String> pair : newMap.entrySet()){
         String key = pair.getKey();
         String value = pair.getValue();
         System.out.println(key + " - " + value);
}
    }


}
