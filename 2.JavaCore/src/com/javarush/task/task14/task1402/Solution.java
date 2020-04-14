package com.javarush.task.task14.task1402;

/* 
Bingo-2!
*/

import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;

import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {/*
        Cat cat = new TomCat();

        boolean isCat = cat instanceof Cat;
        boolean isMovable = cat instanceof CanMove;
        boolean isTom = cat instanceof TomCat;

        if (isCat && isMovable && isTom) System.out.println("Bingo!");*/



    }

    static class Animal{
        public void animalMethod(){
            System.out.println("Animal");
        }
    }

    static class Cat extends Animal {
        public void catMethod(){
            System.out.println("Cat");
        }
    }

    static class Tiger extends Cat {
        public void tigerMethod(){
            System.out.println("Tiger");
        }

    }
}
