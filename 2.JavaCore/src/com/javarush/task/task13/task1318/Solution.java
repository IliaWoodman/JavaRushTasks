package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path1 = reader.readLine();
        String path2 = reader.readLine();

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path1));

        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(path2));
        while (bufferedInputStream.available() > 0) {
            char c = (char) bufferedInputStream.read();
            System.out.print(c);
        }
        reader.close();
        bufferedInputStream.close();


       /* InputStream inputStream = null;
        BufferedInputStream buffer = null;

        try {

            inputStream = new FileInputStream("C:\\Users\\QS_Specialist\\Desktop\\Share\\123.txt");

            buffer = new BufferedInputStream(inputStream);

            while(buffer.available()>0) {

                char c = (char)buffer.read();

                System.out.println("Был прочитан символ " + c);
            }
        } catch(Exception e) {

            e.printStackTrace();

        } finally {

            inputStream.close();
            buffer.close();
        }
    }*/
    }
}
