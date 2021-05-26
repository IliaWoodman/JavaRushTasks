package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        int counter = 0;

        try (FileInputStream inputStream = new FileInputStream(path)) {
            while (inputStream.available() > 0) {

                if (inputStream.read() == 44) {
                    counter++;
                }
            }
            System.out.println(counter);

        }
    }
}
