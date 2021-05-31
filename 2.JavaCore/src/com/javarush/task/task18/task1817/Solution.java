package com.javarush.task.task18.task1817;

import java.io.*;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String buffer = "";
        while (bufferedReader.ready()) {
            buffer += bufferedReader.readLine();
        }
//        String buffer = "asd asdqwd refgsfdas fw3qll 13413 ";
        int common = buffer.length();
        int counter = 0;
        String[] arr = buffer.split("");
        for (String s : arr) {
            if (s.equals(" ")) {
                counter++;
            }
        }

        Double res = (double) counter / (double) common * 100;
        System.out.printf("%.2f", res);
        bufferedReader.close();
    }
}
