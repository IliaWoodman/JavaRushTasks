package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int third = Integer.parseInt(reader.readLine());
        Solution solution = new Solution();
        solution.mainMethod(first, second, third);
    }
    public void mainMethod(int a, int b, int c){
        int plusNumber = plusMethod(a) + plusMethod(b) + plusMethod(c);
        int minusNumber = minusMethod(a) + minusMethod(b) + minusMethod(c);
        System.out.println("количество отрицательных чисел: " + minusNumber);
        System.out.println("количество положительных чисел: " + plusNumber);
    }
    public int plusMethod(int a){
        int plus = 0;
        if (a > 0){
            plus = plus + 1;
        }else{};
        return plus;
    }
    public int minusMethod(int a){
        int minus = 0;
        if (a < 0){
            minus = minus + 1;
        }else{};
        return minus;
    }
}
