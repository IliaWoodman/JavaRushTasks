package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
    /*    FileInputStream inputStream = new FileInputStream(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));*/

        String line;
        ArrayList<Integer> list = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null) {
            if (Integer.parseInt(line) % 2 == 0)
                list.add(Integer.parseInt(line));
        }

        Collections.sort(list, Collections.reverseOrder());
        for (Integer i : list){
            System.out.println(i);
        }

/*        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.add(j, list.get(j + 1));
                    list.remove(j + 1);
                    list.add(j + 1, temp);
                    list.remove(j + 2);
                }
            }
        }*/
/*        for (Integer i : list){
            System.out.println(i);
        } */
        bufferedReader.close();
    }
}
