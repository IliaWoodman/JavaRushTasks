package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int number = Integer.parseInt(reader.readLine());


        if (number <= 0) {

        } else {
            int[] arr = new int[number];
            if (number > 0) {
                for (int i = 0; i < number; i++) {
                    int chislo = Integer.parseInt(reader.readLine());
                    arr[i] = chislo;
                }
            }

            //напишите тут ваш код
            maximum = arr[0];
            for (int k = 0; k < arr.length; k++) {
                if (maximum < arr[k]) {
                    maximum = arr[k];
                }
            }
            System.out.println(maximum);
        }
    }
}
