package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int pointFirst = 0;
        int pointSecond = 0;

        if (this.age > anotherCat.age) {
            pointFirst = pointFirst + 1;
        } else if (this.age == anotherCat.age) {

        } else {
            pointSecond = pointSecond + 1;
        }

        if (this.strength > anotherCat.strength) {
            pointFirst = pointFirst + 1;
        }else if ( this.strength == anotherCat.strength){
        }else {pointSecond = pointSecond + 1;}

        if (this.weight > anotherCat.weight){
            pointFirst =pointFirst + 1;
        }else if (this.weight == anotherCat.weight){
        }else {pointSecond =pointSecond + 1;}

        if (pointFirst > pointSecond){
            return true;
        }else {return false;}
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 4;
        cat1.strength = 4;
        cat1.weight = 5;

        Cat cat2 = new Cat();
        cat2.age = 3;
        cat2.strength = 4;
        cat2.weight = 5;

        System.out.println(cat1.fight(cat2));
    }
}
