package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedName = reader.readLine();
        Cat ded = new Cat(dedName);

        String babkaName = reader.readLine();
        Cat babka = new Cat(babkaName);

        String papaName = reader.readLine();
        Cat papa = new Cat(papaName,null,ded);

        String mamaName = reader.readLine();
        Cat mama = new Cat(mamaName, babka, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName,mama,papa);

        String dochaName = reader.readLine();
        Cat docha = new Cat(dochaName,mama,papa);

        System.out.println(ded);
        System.out.println(babka);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(son);
        System.out.println(docha);

    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father; 

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
             if (mother == null && father == null){
                 return "The cat's name is " + name + " , no mother, no father";
             }else if(mother == null){
                 return "The cat's name is " + name + ", no mother, father is " +father.name;
             }else if (father == null){
                 return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
             }else {
                 return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
             }
        }
    }

/*    The cat's name is дедушка Вася, no mother, no father
    The cat's name is бабушка Мурка, no mother, no father
    The cat's name is папа Котофей, no mother, father is дедушка Вася
    The cat's name is мама Василиса, mother is бабушка Мурка, no father
    The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
    The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей*/


}
