package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static class Cat  {}

        public static Set<Cat> createCats() {
            //напишите тут ваш код. step 2 - пункт 2
            Set<Cat> catsOne = new HashSet<>();
            catsOne.add(new Cat());
            catsOne.add(new Cat());
            catsOne.add(new Cat());
            return catsOne;
        }

        public static void printCats(Set<Cat> cats) {
            // step 4 - пункт 4
            Set<Cat> copy = new HashSet<>(cats);
            for(Cat cat: copy){
                System.out.println(cat);
            }

            }


    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        for (Cat cat: cats){
            cats.remove(cat);
            break;
        }
        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }


    // step 1 - пункт 1
}
