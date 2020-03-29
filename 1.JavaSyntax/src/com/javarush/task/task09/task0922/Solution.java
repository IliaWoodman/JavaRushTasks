package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String s = reader.readLine();
        Date date1 = dateFormat.parse(s);
        String res = dateFormat1.format(date1);
        System.out.println(res.toUpperCase());
        ArrayList<String> list = new ArrayList<>(100);

    }
}
