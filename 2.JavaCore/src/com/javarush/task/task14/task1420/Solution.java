package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b; //2 //18 //
            a = b; //18 //2
            b = tmp; //2 // 9
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if ((a > 0) && (b > 0)) {
            System.out.println(gcd(a, b));
        } else {
            throw new Exception();
        }
    }

}
