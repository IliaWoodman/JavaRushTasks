package com.javarush.task.task07.task0721;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = arr[0];
        int minimum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i]){
                maximum = arr[i];
            }
            if (minimum > arr[i]){
                minimum = arr[i];
            }
        }



        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
