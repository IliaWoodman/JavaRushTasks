package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //  ArrayList<String> list = new ArrayList<>();
        String string = reader.readLine();
        String[] strArray = string.split("");
        strArray[0] = strArray[0].toUpperCase();
        for (int i = 0; i < strArray.length - 1; i++) {
            if (strArray[i].equals(" ")) {
                strArray[i + 1] = strArray[i + 1].toUpperCase();
            }
        }
        for (String s : strArray) {
            System.out.print(s);
        }
        //напишите тут ваш код
    }
}
