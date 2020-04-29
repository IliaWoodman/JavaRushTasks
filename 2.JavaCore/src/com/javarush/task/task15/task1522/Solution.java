package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            if (s.equals("moon")){
                thePlanet = Moon.getInstance();
            }else if (s.equals("sun")){
                thePlanet = Sun.getInstance();
            }else if (s.equals("earth")){
                thePlanet = Earth.getInstance();
            }else{
                thePlanet = null;
            }
            System.out.println(thePlanet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
