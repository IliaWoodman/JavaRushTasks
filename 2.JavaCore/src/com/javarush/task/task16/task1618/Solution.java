package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread test = new TestThread();
        test.start();
        Thread.sleep(2000);
        test.interrupt();

    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        public void run(){
            System.out.println("Start");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finish");
        }
    }
}