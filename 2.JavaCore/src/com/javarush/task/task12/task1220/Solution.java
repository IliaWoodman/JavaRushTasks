package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут
    public  class Human implements CanRun, CanSwim{

        @Override
        public void iCanRun() {

        }

        @Override
        public void asd() {

        }

        @Override
        public void iCanSwim() {

        }
    }

    public interface CanRun{
       void iCanRun();
       void asd();
    }
    public interface CanSwim{
        void iCanSwim();
    }
}
