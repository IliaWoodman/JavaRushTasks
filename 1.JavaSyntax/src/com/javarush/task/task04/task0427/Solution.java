package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int first = Integer.parseInt(reader.readLine());
        Solution solution = new Solution();
        solution.mainMethod(first);
    }
    public void mainMethod(int a) {
        if (a >= 1 && a <= 999){
            plusOrMinusMethod(a);
            nemberLength(a);
        }else{


        }
    }
    public void nemberLength (int a){
        if(a >= 1 && a <= 9){
            System.out.println(" однозначное число");
        }else if (a > 9 && a < 100){
            System.out.println(" двузначное число");
        }else if (a >= 100 && a < 1000){
            System.out.println(" трехзначное число");
        }else{};
    }

    public void plusOrMinusMethod (int a){
        if(a % 2 == 0){
            System.out.print("четное");
        }else {
            System.out.print("нечетное");
        }
    }
}
