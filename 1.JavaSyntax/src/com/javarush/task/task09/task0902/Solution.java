package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

import com.sun.org.apache.regexp.internal.RE;

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
        }

    public static String method2() {
        method3();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method4() {
        method5();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method5() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}