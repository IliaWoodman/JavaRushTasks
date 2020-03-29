package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
/*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int third = Integer.parseInt(reader.readLine());
        int fourth = Integer.parseInt(reader.readLine());
        int fifth = Integer.parseInt(reader.readLine());

        int[] arrFirst = {first, second, third, fourth, fifth};
        for (int i = 0; i < arrFirst.length; i++) {


        }

        for (int i = 0; i < arrFirst.length; i++) {
            for (int j = 0; j < arrFirst.length - 1; j++) {
                if (arrFirst[j] > arrFirst[j + 1]) {
                    int temp = arrFirst[j + 1];
                    arrFirst[j + 1] = arrFirst[j];
                    arrFirst[j] = temp;
                }
            }
        }

        for (int i = 0; i < arrFirst.length; i++) {
            System.out.println(arrFirst[i]);

        }
*/
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        int max = arr[0];
        int min = arr[0];
        int avg = 0;

        for (int i = 0; i <arr.length ; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
            avg = avg + arr[i] / arr.length;
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);


    }
}


