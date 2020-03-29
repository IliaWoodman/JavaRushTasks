package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        while (true){
            String inputValue = reader.readLine();
            if (inputValue.equals("сумма")){
                System.out.println(res);
                break;
            }else{
                res = res + Integer.parseInt(inputValue);
            }
        }
    }
}
