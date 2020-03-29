package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> common = new ArrayList<>();
        ArrayList<Integer> listThree = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        ArrayList<Integer> listThreeAndTwo = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            common.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < common.size(); i++) {
            if (common.get(i) % 3 == 0 && common.get(i) % 2 == 0){
                listThree.add(common.get(i));
                listTwo.add(common.get(i));
            }else if(common.get(i) % 3 == 0){
                listThree.add(common.get(i));
            }else if(common.get(i) % 2 == 0){
                listTwo.add(common.get(i));
            }else{
                listThreeAndTwo.add(common.get(i));
            }
        }

        printList(listThree);
        System.out.println();
        printList(listTwo);
        System.out.println();
        printList(listThreeAndTwo);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }
}
