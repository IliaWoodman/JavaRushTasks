package com.javarush.task.task02.task0208;

import java.util.Scanner;

/*
Одного кота нам мало
*/
public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner("На голой ветке\n" +
                "Ворон сидит одиноко.\n" +
                "Осенний вечер.\n\n***" +
                " \n" +
                " \n" +
                "В небе такая луна,\n" +
                "Словно дерево спилено под корень:\n" +
                "Белеет свежий срез.\n\n***" +
                " \n" +
                " \n" +
                "Как разлилась река!\n" +
                "Цапля бредет на коротких ножках,\n" +
                "По колено в воде.");

        scan.useDelimiter("\n/*/*/*");

        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }

        scan.close();

    }

}
