package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        ArrayList<String>list = new ArrayList<>();

        while (true){
            String string = reader.readLine();
            if (string.equals("exit")){
                list.add(string);
                break;
            }else{
                list.add(string);
            }
        }

        for (String value:list){
            writer.write(value + "\n");
        }
        reader.close();
        writer.close();
    }
}
