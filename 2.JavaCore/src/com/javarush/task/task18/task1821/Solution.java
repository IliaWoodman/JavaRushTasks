package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        String buffer = "asd asd  f2n 23hri was'd -s[pd; wq0do w0ladp ,xmn 18920po i rj31wq syachja jk";
        byte[] arr = new byte[fileInputStream.available()];
        fileInputStream.read(arr);
        HashMap<Character, Integer> map = new HashMap<>();

        for (byte b : arr) {
            map.put((char) b, map.getOrDefault((char) b, 0) + 1);
        }
        map.forEach((k, v) -> System.out.println(k + " " + v));




        int[] aSCII = new int[128];
        try (FileReader reader = new FileReader(args[0])) {
            while (reader.ready()) {
                aSCII[reader.read()]++;
            }
        }
        for (int i = 0; i < aSCII.length; i++) {
            if (aSCII[i] != 0) {
                System.out.println((char) i + " " + aSCII[i]);
            }
        }
    }
}
