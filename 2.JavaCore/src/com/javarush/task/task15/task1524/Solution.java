package com.javarush.task.task15.task1524;

/*
static void init()  1
Static block  2
public static void main 3
Non-static block  4
static void printAllFields  5
null  6
0  7
Solution constructor  8
static void printAllFields  9
First name  10
6    11
Порядок загрузки переменных
static void init() //
Static block //
public static void main  //
Non-static block  //
static void printAllFields  //
0 //
null //
Solution constructor  //
static void printAllFields //
6  //
First name //
*/

public class Solution {
    static {
        System.out.println("static void init()");
    }

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";

    static {
        init();
    }

    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
