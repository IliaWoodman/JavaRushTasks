package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int stringN = Integer.parseInt(reader.readLine());
        int numberN = Integer.parseInt(reader.readLine());

        for(int i = 0; i < stringN; i++) {
            for (int k = 0; k < numberN; k++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
