package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    //    /Users/ilya.romanenko/Desktop/test.txt
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new TreeSet<>();
        String fileName = reader.readLine();
        int[] byteCountArray = new int[255];

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                set.add(fileInputStream.read());
            }
        }

        for (int i : set) {
            System.out.print(i + " ");
        }
    }
}
