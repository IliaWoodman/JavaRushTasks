package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        String[] arrStr = new String[10];
        int[] arrNum = new int[10];

        for (int i = 0; i <arrStr.length ; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            arrStr[i] = reader.readLine();
        }
        for (int i = 0; i <arrNum.length ; i++) {
            arrNum[i] = arrStr[i].length();
            System.out.println(arrNum[i]);

        }
    }
}
