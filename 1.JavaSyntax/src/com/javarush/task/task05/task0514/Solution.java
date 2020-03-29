package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Qwe", 33);
        System.out.println(person.name);
        System.out.println(person.age);
        //напишите тут ваш код
    }

    static class Person {
        //напишите тут ваш
        String name;
        int age;

        public void initialize (String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
