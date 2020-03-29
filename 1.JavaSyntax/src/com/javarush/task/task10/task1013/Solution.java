package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
       private String name;
       private int age;
       private boolean sex;
       private double weight;
       private Women wife;
       private Men husband;

        public Human(String name) {
            this.name = name;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, int age, int weight, boolean sex) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name, int age, Women wife) {
            this.name = name;
            this.age = age;
            this.wife = wife;
        }

        public Human(String name, int age, Men husband) {
            this.name = name;
            this.age = age;
            this.husband = husband;
        }

        public Human(String name, int age, Men husband, Women wife) {
            this.name = name;
            this.age = age;
            this.husband = husband;
            this.wife = wife;
        }

        public Human(String name, int weight, Men husband, boolean sex){
            this.name = name;
            this.weight = weight;
            this.husband = husband;
            this.sex = sex;
        }


    }

    public static class Women extends Human {
        public Women(String name) {
            super(name);
        }
    }

    public static class Men extends Human {

        public Men(String name) {
            super(name);
        }
    }
}
