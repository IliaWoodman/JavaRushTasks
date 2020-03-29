package com.javarush.task.task04.task0428;

/* 
Положительное число
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
    public void mainMethod(int a, int b, int c) {
        int res = checkMethod(a) + checkMethod(b) + checkMethod(c);
        System.out.println(res);

    }
    public int checkMethod(int a){
       int resA = 0;
        if (a > 0){
           resA = resA + 1 ;
        }else{};
        return resA;
    }

}
