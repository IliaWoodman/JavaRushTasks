package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

//        /Users/ilya.romanenko/Desktop/data.txt
//        /Users/ilya.romanenko/Desktop/result1.txt
//        /Users/ilya.romanenko/Desktop/result2.txt

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path1 = reader.readLine();
        String path2 = reader.readLine();
        String path3 = reader.readLine();
        try (FileInputStream inputStream = new FileInputStream(path1);
             FileOutputStream outputStream1 = new FileOutputStream(path2);
             FileOutputStream outputStream2 = new FileOutputStream(path3);
        ) {
            int count = inputStream.available();
            int counter = 0;

            while (inputStream.available() > 0){
                if (counter < (count + 1) /2){
                    counter++;
                    outputStream1.write(inputStream.read());
                }else
                    outputStream2.write(inputStream.read());
            }

        }
    }
}
