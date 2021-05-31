package com.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
// /Users/ilya.romanenko/Desktop/d1.txt
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String row = "";
        while (reader.ready()) {
            row = row + reader.readLine();
        }
        String[] arr = row.split("");
        int counter = 0;
        for (String s : arr) {
            if (Pattern.matches("[a-zA-Z]+", s)) {
                counter++;
            }
        }
        System.out.println(counter);
        reader.close();
    }
}
