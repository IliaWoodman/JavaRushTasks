package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <10 ; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int min = list.get(0);
        int count = 0;
        int resCount = 0;

        for (int i = 0; i < list.size(); i++) {
            if (min == list.get(i)){
                count = count + 1;
            }else if(min != list.get(i)){
                if (resCount < count){
                    resCount = count;
                }
                count = 0;
                min = list.get(i);
                count = count + 1;
            }
        }
        if (resCount < count){
            resCount = count;
        }
        System.out.println(resCount);

    }
}