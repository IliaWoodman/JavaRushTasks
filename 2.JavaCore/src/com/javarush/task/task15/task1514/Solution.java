package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(12.3, "asd");
        labels.put(12.4, "asdas");
        labels.put(12.5, "sdf");
        labels.put(12.6, "cv");
        labels.put(12.7, "hd");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
