package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));


        String string = "qweqwe1qwe1asd1ad1qwew qwer";
        Scanner scanner = new Scanner(string);
        scanner.useDelimiter("q");
        System.out.println(scanner.next());
        System.out.println("\n********");
        System.out.println(546 % 10);
        System.out.println(546 / 100);
        System.out.println(546 / 10 % 10);
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String sNumber = Integer.toString(number);
        String[] arr = sNumber.split("");
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            res = res + Integer.parseInt(arr[i]);
        }
        return res;
    }
}