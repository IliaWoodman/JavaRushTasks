package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean a = false;
        int res = 0;
        int count = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1) {
                System.out.println((double) res / count);
                break;
            } else {
                count++;
                res = res + number ;
            }
        }
    }
}

