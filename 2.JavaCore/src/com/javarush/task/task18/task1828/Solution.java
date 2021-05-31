package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args.length != 0) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String path = reader.readLine();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            ArrayList<String> listString = new ArrayList<>();
            ArrayList<Integer> listInt = new ArrayList<>();
            String row = "";
            while ((row = bufferedReader.readLine()) != null) {
                listString.add(row);
            }
            listString.forEach(i -> listInt.add(Integer.parseInt(i.substring(0, 8).trim())));
            int index = listInt.indexOf(Integer.parseInt(args[1]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));

            if (args[0].equals("-d")) {
                listString.remove(index);
            } else if (args[0].equals("-u")) {
                listString.remove(index);
                listString.add(index, String.format("%-8s%-30s%-8s%-4s", args[1], args[2], args[3], args[4]));
            }
            for (String s : listString) {
                writer.write(s + "\n");
            }
            writer.close();
            bufferedReader.close();
            reader.close();
        }
    }
}