package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>(); // Заполняем новый лист значениями в одном регистре
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i).toLowerCase());
        }
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (newList.get(i).equals(newList.get(j))){
                    count++;
                }
            }
            if (!result.containsKey(newList.get(i))) {
                result.put(newList.get(i), count);
            }
            count = 0;
        }

        return result;
    }

}

