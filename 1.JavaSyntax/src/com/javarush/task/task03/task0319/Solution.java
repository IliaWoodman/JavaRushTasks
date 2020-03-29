package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("please enter name: ");
        String name = reader.readLine();
        System.out.println("Enter namber 1: ");
        String sNumb1 = reader.readLine();
        int nNumb1 = Integer.parseInt(sNumb1);
        System.out.println("Enter number 2: ");
        int nNumb2 = Integer.parseInt(reader.readLine());

        System.out.println(name + " получает " + nNumb1 + " через " + nNumb2 + " лет.");
/*
        Коля получает 3000 через 5 лет.
*/



    }
}
