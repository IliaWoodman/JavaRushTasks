package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).equals("мама") || list.get(i).equals("мыла") || list.get(i).equals("раму")){
                list.add(i+1,"именно");
            }
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
