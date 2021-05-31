package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
//        -e /Users/ilya.romanenko/Desktop/d1.txt /Users/ilya.romanenko/Desktop/d2.txt
//        -e /Users/ilya.romanenko/Desktop/d2.txt /Users/ilya.romanenko/Desktop/d3.txt
//        -e fileName fileOutputName
//        -d fileName fileOutputName
        if (args[0].equals("-e")) {
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(args[1]));
                 BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(args[2]))) {
                while (bufferedInputStream.available() > 0) {
                    bufferedOutputStream.write(bufferedInputStream.read() * -1);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (args[0].equals("-d")) {
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(args[1]));
                 BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(args[2]))) {
                while (bufferedInputStream.available() > 0) {
                    bufferedOutputStream.write(bufferedInputStream.read() * -1);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
