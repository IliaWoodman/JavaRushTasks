package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
/*        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        // Read the house number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();

        while (true){
            String s1 = reader.readLine();
            map.put(s1,"");
            if (s1.isEmpty()){
                break;
            }
            String s2 = reader.readLine();
            map.replace(s1, s2);
            if (s2.isEmpty()){
                break;
            }
        }

        Map<String , String> copy = new HashMap<>(map);
        String city = reader.readLine();
        for (Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();

            if (key.equals(city)){
                System.out.println(value);
            }
        }
        //System.out.println(map);


    }
}
