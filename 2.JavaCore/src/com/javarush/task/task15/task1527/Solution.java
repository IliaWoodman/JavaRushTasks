package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/


import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        String[] strings = new Scanner(System.in).nextLine().split("[?]")[1].split("[&]");
        String[] defer = null;
        for (String s : strings){
            String[] s1 = (s.split("[=]"));
            if (s1[0].equals("obj")){
                defer = s1;
            }
            System.out.print(s1[0] + " ");
        }
        System.out.println();
        if (defer != null) {
            try {
                alert(Double.parseDouble(defer[1]));
            }
            catch (Exception e){
                alert(defer[1]);
            }
        }
/*        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String [] defer = null;
        String[] strings = s.split("[?]")[1].split("[&]");
        for (int i = 0; i < strings.length; i++) {
            String[] s1= strings[i].split("[=]");
            if (s1[0].equals("obj")){
                defer = s1;
            }
            System.out.print(s1[0] + " ");
        }
        System.out.println("");
        if (defer != null){
            try{
                alert(Double.parseDouble(defer[1]));
            } catch (NumberFormatException e) {
                alert(defer[1]);
            }
        }*/
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
