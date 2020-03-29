package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        // заполняем список
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }                                   // объявляем переменны
        int min = list.get(0).length();
        int max = list.get(0).length();
        int countMin = 0;
        int countMax = 0;
        String longStr = list.get(0);
        String shortStr = list.get(0);
                                            // подбираем наибольшее число
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i).length()) {
                max = list.get(i).length();
                countMax = i;
                longStr = list.get(i);
            }                               // подбираем наименьшее число
            if (min > list.get(i).length()) {
                min = list.get(i).length();
                countMin = i;
                shortStr = list.get(i);
            }
        }                                   //выбираем наиб или наим число оказалось первым и выводим
        if (countMax > countMin) {
            System.out.println(shortStr);
        } else {
            System.out.println(longStr);
        }
    }
}
