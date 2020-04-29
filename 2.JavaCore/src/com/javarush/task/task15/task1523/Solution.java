package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    Solution(){
        System.out.println("default");
    }
    private Solution(String s){
        System.out.println("private");
    }
    public Solution(int i){
        System.out.println("public");
    }
    protected Solution(String s, int i){
        System.out.println("protected");
    }
    public static void main(String[] args) {

    }
}

