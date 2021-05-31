package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

//        /Users/ilya.romanenko/Desktop/data.txt
//        /Users/ilya.romanenko/Desktop/result1.txt

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path1 = reader.readLine();
        String path2 = reader.readLine();
        try (FileInputStream inputStream = new FileInputStream(path1);
             FileOutputStream outputStream1 = new FileOutputStream(path2);
        ) {
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            for (int i = 0; i < buffer.length / 2; i++) {
                byte temp = buffer[i];
                buffer[i] = buffer[buffer.length - i - 1];
                buffer[buffer.length - i - 1] = temp;
            }
            outputStream1.write(buffer);
        }
    }
}
