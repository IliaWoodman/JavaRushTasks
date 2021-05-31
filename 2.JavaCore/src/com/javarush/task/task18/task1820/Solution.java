package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//    /Users/ilya.romanenko/Desktop/d1.txt
//    /Users/ilya.romanenko/Desktop/d2.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path1 = reader.readLine();
        String path2 = reader.readLine();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path1));
        String buffer = bufferedReader.readLine();
//        String buffer = "3.5 3.49 3.51 9.9999";

        List<String> list = Arrays.asList(buffer.split(" "));
        ArrayList<Integer> intList = new ArrayList<>();

        for (String s : list) {
            intList.add((int) Math.round(Double.parseDouble(s)));
        }
        String r = "";
        r = intList.stream().map(i -> i + "").collect(Collectors.joining(" "));
        BufferedWriter writer = new BufferedWriter(new FileWriter(path2));
        writer.write(r);

        writer.close();
        reader.close();
        bufferedReader.close();

    }
}
