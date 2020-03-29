package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                                                    // заполняем список
        for (int i = 0; i <5 ; i++) {
            list.add(reader.readLine());
        }
        int min = list.get(0).length();
                                                    // находим самую наименьшую строку
        for (int i = 0; i <list.size() ; i++) {
            if (min>list.get(i).length()){
                min = list.get(i).length();
            }
        }
                                                    // заполняем новый список самыми длинными строками
        for (int i = 0; i <list.size() ; i++) {
            if (min == list.get(i).length()){
                strings.add(list.get(i));
            }
        }
                                                    //выводим наименьшие строку / строки
        for (int i = 0; i <strings.size() ; i++) {
            System.out.println(strings.get(i));
        }

    }
}
