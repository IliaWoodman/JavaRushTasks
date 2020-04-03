package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

import com.sun.org.apache.bcel.internal.generic.MONITORENTER;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public class Cat implements Movable, Edible, Eat {

        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void eat() {

        }
    }

    public class Mouse implements Edible, Movable {

        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }

    public class Dog implements Movable, Eat {

        @Override
        public void move() {
        }

        @Override
        public void eat() {

        }
    }
}