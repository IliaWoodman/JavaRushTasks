package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String[] arrFirst = first.split("");

        for (int i = 0; i < first.length(); i++) {
            if (Integer.parseInt(arrFirst[i]) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);


        //  System.out.println(arrFirst[0] + " " + arrFirst[1] + " " + arrFirst[2]);


    }
}
