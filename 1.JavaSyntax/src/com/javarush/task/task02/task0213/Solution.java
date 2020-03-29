package com.javarush.task.task02.task0213;

/* 
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
/*
        Woman women = new Woman();


        Dog dog = new Dog();
        dog.owner = women;


        Fish fish = new Fish();
        fish.owner = women;

        Cat cat = new Cat();
        cat.sobaka = dog;

        cat.ryba = fish;*/


        int[][] cats = {{1,2,3,4,5}, {6,7,8,9,0}, {11, 12, 13, 44, 55, 342, 34}};

        for (int i = 0; i < cats.length; i++) {
            for (int j = 0; j <cats[i].length ; j++) {
                System.out.print(cats[i][j] + " ");
            }
            System.out.println();

        }

    }

/*    public static class Cat {
        public Woman owner;
        public Dog sobaka;
        public Fish ryba;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }*/
}
