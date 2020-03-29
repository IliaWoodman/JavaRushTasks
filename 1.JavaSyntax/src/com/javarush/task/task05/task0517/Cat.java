package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш коStд
    String name;
    int age;    //////////
    int weight;  //////////
    String color; /////////
    String address;

    public Cat(String name) {
        this.name = name;
        this.age = 3;
        this.color = "gray";
        this.weight = 5;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "gray";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "color";
        this.weight = 3;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 3;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;
    }


    public static void main(String[] args) {

    }
}
