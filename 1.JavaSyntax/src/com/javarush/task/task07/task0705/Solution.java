package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArr = new int[20];
        int[] firstArr = new int[10];
        int[] secondArr = new int[10];

        for (int i = 0; i < bigArr.length; i++) {
            bigArr[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = bigArr[i];
            secondArr[i] = bigArr[i+10];
            System.out.println(secondArr[i]);
        }
    }
}
