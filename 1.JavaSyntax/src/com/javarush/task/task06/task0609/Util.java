package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double res = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2));
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getDistance(5,6,4,8));
    }
}
