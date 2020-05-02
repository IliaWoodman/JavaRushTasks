package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                while (numSeconds >= 1) {
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    Thread.sleep(1000);
                }
                System.out.print("Марш!");
            } catch (InterruptedException e) {
                System.out.print("Прервано!");
            }

            //add your code here - добавь код тут
/*            if (numSeconds == 3) {
                while (numSeconds >= 1) {
                    try {
                        System.out.print(numSeconds + " ");
                        numSeconds--;
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            System.out.print("Марш!");
            }
            else if (numSeconds == 4){
                while ()
            }*/
        }
    }
}
