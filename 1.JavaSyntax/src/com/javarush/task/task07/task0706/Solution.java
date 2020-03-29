package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArr = new int[15];

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < bigArr.length; i++) {
            bigArr[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0) {
                sumEven = sumEven + bigArr[i];
            } else {
                sumOdd = sumOdd + bigArr[i];
            }
        }
        if (sumEven > sumOdd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else{
            System.out.println( "В домах с нечетными номерами проживает больше жителей.");
        }



    }
}
