package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        String s = list.toString(); //получаем строку из листа
        char[] tempArr = s.toCharArray(); // переводим строку в массив символов
        ArrayList<Character> finalArr = new ArrayList<>(); // создаем новый лист

/*        for (int i = 0; i < tempArr.length; i++) { // добавляем в новый лист только элементы которые есть в алфавите
            for (int j = 0; j < alphabet.size(); j++) {
                if (tempArr[i] == alphabet.get(j)) {
                    finalArr.add(tempArr[i]);
                }
            }
        }*/

        int count = 0;                  // пробегаем по tempArr и увеличиваем счетчик если буква эквол алфавиту;
        for (int i = 0; i < alphabet.size(); i++) {
            for (int j = 0; j < tempArr.length; j++) {
                if (tempArr[j] == alphabet.get(i)){
                    count++;
                }
            }
            System.out.println(alphabet.get(i) + " " + count);
            count = 0;
        }


/*        ArrayList<> newList = new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                newList.add(list.get(i).toCharArray());
            }
        }*/


        // напишите тут ваш код
    }
}
