package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {

    //    /Users/ilya.romanenko/Desktop/test/d1.txt.part1
    //    /Users/ilya.romanenko/Desktop/test/d1.txt.part2
    //    /Users/ilya.romanenko/Desktop/test/d1.txt.part3
    public static void main(String[] args) throws IOException {
        HashMap<Integer, byte[]> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path;
        String newPath = "";
        while (true) {
            if (!(path = reader.readLine()).equals("end")) {
                newPath = path.substring(0, path.lastIndexOf("."));
                FileInputStream fileInputStream = new FileInputStream(path);
                int a = Integer.parseInt(path.substring(path.lastIndexOf(".")).substring(5));
                byte[] buffer = new byte[fileInputStream.available()];
                fileInputStream.read(buffer);
                map.put(a, buffer);
                fileInputStream.close();
            } else {
                break;
            }

        }
        System.out.println(newPath);
        FileOutputStream fileOutputStream = new FileOutputStream(newPath);
        for (Integer i : map.keySet()) {
            fileOutputStream.write(map.get(i));
        }
        fileOutputStream.close();
    }
}
