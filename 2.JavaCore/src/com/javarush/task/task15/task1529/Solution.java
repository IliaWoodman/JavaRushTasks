package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int count = 0;
        try{
            while (true){
                s = reader.readLine();
                if (s.equals("helicopter")){
                    result = new Helicopter();
                    System.out.println("qweqwe");
                    reader.close();
                    break;
                }else if (s.equals("plane")){
                    int a = Integer.parseInt(reader.readLine());
                    result = new Plane(a);
                    System.out.println("asdasd");
                    reader.close();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("something went wrong");
        }
    }
}
