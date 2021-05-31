package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader readera = new BufferedReader(new InputStreamReader(System.in));
        String path = readera.readLine();
        ArrayList<String> listString = new ArrayList<>();
        ArrayList<Integer> listInt = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String a = "";

        while ((a = reader.readLine()) != null) {
            listString.add(a);
        }
        for (String s : listString) {
            listInt.add(Integer.parseInt(s.substring(0, 8).trim()));
        }
        int idInt = listInt.stream().max(Integer::compareTo).get() + 1;
        System.out.println(listInt);
        String t = idInt + "";
        String patternId = "        ";
        String patternName = "                              ";
        String patternPrice = "        ";
        String patternQuantity = "    ";
        if (args.length != 0) {
            if (args[1].length() > 30) {
                args[1] = args[1].substring(0, 30);
            }
            if (args[2].length() > 8) {
                args[2] = args[2].substring(0, 8);
            }
            if (args[3].length() > 4) {
                args[3] = args[3].substring(0, 4);
            }
            String id = t + patternId.substring(t.length());

            String name = args[1] + patternName.substring(args[1].length());
            String price = args[2] + patternPrice.substring(args[2].length());
            String quantity = args[3] + patternQuantity.substring(args[3].length());
            listString.add(id + name + price + quantity);
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for (String s : listString) {
                writer.write(s + "\n");
            }
            reader.close();
            writer.close();
        }

    }
}
