package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path1 = reader.readLine();
        String path2 = reader.readLine();
        FileInputStream inputStream1 = new FileInputStream(path1);
        FileInputStream inputStream2 = new FileInputStream(path2);
        byte[] buffer1 = new byte[inputStream1.available()];
        byte[] buffer2 = new byte[inputStream2.available()];

        inputStream1.read(buffer1);
        inputStream2.read(buffer2);

        FileOutputStream fileOutputStream = new FileOutputStream(path1);
        fileOutputStream.write(buffer2);
        fileOutputStream.write(buffer1);

        inputStream1.close();
        inputStream2.close();
        fileOutputStream.close();
    }
}
