package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;



    public void initialize(String name){
        this.name = name;
        this.age = 3;
        this.color = "gray";
        this.weight = 5 ;
    }

    public void initialize (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "gray";
    }

    public void initialize (String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 3;
    }

    public void initialize (int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 3;
    }

    public void initialize (int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;
    }
    //напишите тут ваш код

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.initialize("qwe", 44, 4);
    }
}
