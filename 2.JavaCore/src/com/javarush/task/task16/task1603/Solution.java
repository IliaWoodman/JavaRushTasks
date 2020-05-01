package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread one = new SpecialThread();
        Thread first = new Thread(one);
        SpecialThread two = new SpecialThread();
        Thread second = new Thread(two);
        SpecialThread three = new SpecialThread();
        Thread third = new Thread(three);
        SpecialThread four = new SpecialThread();
        Thread fourth = new Thread(four);
        SpecialThread five = new SpecialThread();
        Thread fifth = new Thread(five);
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        list.add(fifth);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
