package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
         int stringN = 1;
         int numberN = 1;

        while (stringN <= 10){
            while (numberN <= 10){
                System.out.print(stringN * numberN + " ");
                numberN = numberN + 1;
            }
            System.out.println();
            numberN = 1;
            stringN = stringN +1;
        }


}
    }

