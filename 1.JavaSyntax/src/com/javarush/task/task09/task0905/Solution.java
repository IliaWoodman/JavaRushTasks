package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
        System.out.println(deep + " adasd");
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        int count = 0;
        for (StackTraceElement element: Thread.currentThread().getStackTrace()){
            count = count + 1;
        }
        System.out.println(count);
        return count;
    }
}

