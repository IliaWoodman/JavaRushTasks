package com.javarush.task.task17.task1702;

import java.lang.reflect.Array;
import java.util.*;

/* 
Вместе быстрее? Ща проверим :)
*/

public class Solution {
    public static int threadCount = 10;
    public static int[] testArray = new int[1000];

    static {//добавляем в массив значения от 0 к 999
        for (int i = 0; i < Solution.testArray.length; i++) {
            testArray[i] = i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        StringBuffer expectedResult = new StringBuffer();//формируем первую строку значениями из массива в обратно порядке от 999 к 0
        for (int i = 1000 - 1; i >= 0; i--) {
            expectedResult.append(i).append(" ");
        }

        initThreads();//создаем нити, которые сортируют массив

        StringBuffer result = new StringBuffer(); //создаем новую строку которая еще раз заполняется новыми значениями из массива который отсортирован от 999 к 0
        for (int i = 0; i < testArray.length; i++) {
            result.append(testArray[i]).append(" ");
        }
        System.out.println(result);
        System.out.println((result.toString()).equals(expectedResult.toString()));//сравниваем
    }

    public static void initThreads() throws InterruptedException {//заполняем лист потоками//запускаем первый поток//но джоин начиает работать после запуска последней нити, поэтому массив сортируется как попало
        List<Thread> threads = new ArrayList<Thread>(threadCount);
        for (int i = 0; i < threadCount; i++)
            threads.add(new SortThread());
        for (Thread thread : threads)
            thread.start();
        for (Thread thread : threads)
            thread.join();
    }

    public static void sort(int[] array) {//сортировка пузырьком
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
    }

    public static class SortThread extends Thread {
        @Override
        public void run() {
            Solution.sort(testArray);
        }
    }
}

