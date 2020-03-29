package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import javax.crypto.spec.PSource;

public class Solution {
    public void method1(){
        System.out.println("asd");
    }
    public void method1(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {


    }

    static class MyException extends Exception {
    }

    static class MyException2 extends Exception{
    }

    static class MyException3 extends Error{
    }

    static class MyException4 extends Error{
    }
}

