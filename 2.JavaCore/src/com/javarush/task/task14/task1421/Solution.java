package com.javarush.task.task14.task1421;

import java.util.Calendar;

/*
Singleton
*/
public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getName());
        Tiger tiger = new Tiger();
        System.out.println(tiger.getName());
        Cat nigerCat = new Tiger();
        System.out.println(nigerCat.getName());
    }

    interface HasName
    {
        String getName();
        int getWeight();
    }
    static class Cat{
        String name = "Cat";

        String getName(){
            return name;
        }
    }

    static class Tiger extends Cat implements HasName{
        String name;
        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getWeight() {
            return 0;
        }
    }
}
