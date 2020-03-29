package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ////////////////////////////////////////////////// Сортирую массив по 2 листам
        String[] copySort = Arrays.copyOf(array, array.length);
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        for (String s : array) {
            if (isNumber(s)) {
                intList.add(Integer.parseInt(s));
            } else {
                stringList.add(s);
            }
        }
        ////////////////////////////////////////////////// Сортируем цифровой массив
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) < intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
        //////////////////////////////////////////////////// Сортируем строковы массив
        for (int i = 0; i < stringList.size() - 1; i++) {
            for (int j = 0; j < stringList.size() - i - 1; j++) {
                if (isGreaterThan(stringList.get(j), stringList.get(j + 1))){
                    String temp = stringList.get(j);
                    stringList.set(j, stringList.get(j+1));
                    stringList.set(j+1, temp);
                }
            }
        }
        ///////////////////////////////////////////////////// заполняем массив
        int intcount = 0;
        int stringcount = 0;
        for (int i = 0; i <copySort.length ; i++) {
            if (isNumber(copySort[i])){
                array[i]= intList.get(intcount).toString();
                intcount++;
            }
            if (!isNumber(copySort[i])){
                array[i] = stringList.get(stringcount);
                stringcount++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
