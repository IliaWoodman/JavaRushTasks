package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(60,0.7));
        System.out.println(convertEurToUsd(65,0.3));


    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double dollar = eur * course;

        return dollar;

    }
}
