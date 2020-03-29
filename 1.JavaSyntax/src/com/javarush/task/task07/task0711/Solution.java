package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
                                    //заполняем массив
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
                                    // последний элемент перекидываем в первый
        for (int i = 0; i <13 ; i++) {
            list.add(0, list.get(4));
            list.remove(5);
        }

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
