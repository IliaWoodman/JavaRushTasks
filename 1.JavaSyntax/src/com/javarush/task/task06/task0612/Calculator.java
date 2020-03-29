package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a + b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a - b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a * b;
    }

    public static double division(int a, int b) {
        double res = (double) a / b;
        return res;
    }


    public static double percent(int a, int b) {
        //напишите тут ваш код
        double res = (double) a * b / 100;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(percent(20, 25));
        System.out.println(division(9, 4));
    }
}