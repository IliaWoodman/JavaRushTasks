package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String>list = new ArrayList<String>();
        list.add("Vasya");
        list.add("Petya");
        list.add("Dima");
        list.add("Zano");
        list.add("Ololo");
        System.out.println(list.size());

        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));

        }
        }
    }

