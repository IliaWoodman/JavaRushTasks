package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        Solution solution = new Solution();
        solution.mainMethod(number);

    }
    public void mainMethod(int a){
        if (a == 0){
            System.out.println("ноль");
        } else{
            System.out.println(checkPlusOrMinus(a) + checkType(a));
        }
    }


    public String checkType(int a){
        String typeNumber;
        if (a % 2 == 0){
            typeNumber = "четное число";
        }else {
            typeNumber = "нечетное число";
        }
        return typeNumber;
    }
    public String checkPlusOrMinus(int a){
        String plusMinus;
        if(a > 0){
            plusMinus = "положительное ";
        } else{
            plusMinus = "отрицательное ";
        }
        return plusMinus;
    }
}
