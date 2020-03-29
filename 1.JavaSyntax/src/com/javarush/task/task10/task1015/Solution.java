package com.javarush.task.task10.task1015;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayLists = new ArrayList[2];
        arrayLists[0] = new ArrayList<>();
        arrayLists[0].add("ag");
        arrayLists[0].add("dfhd");
        arrayLists[1] = new ArrayList<>();
        arrayLists[1].add("dsfdfhd");
        arrayLists[1].add("hd");
        arrayLists[1].add("235");
        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}