package com.javarush.task.task03.task0306;

/* 
Головоломка со скобками             382
                        (6) + 20 + (42) = 68
                        (2 * 3 + 4) * 5 + (6*7) == (10) * 5 + (67) = 117
                        (2 * 3 + 4) * (5 + 6 * 7) == 10 * 47 = 470
                        2 * (3 + 4) * (5 + 6) * 7 == 14 * 77 = 1078
                        2 * (3 + 4) * 5 +( 6 * 7) == 14 * 5 + 42 = 112
                        2 * (3 + 4) * (5 + 6 * 7 ) == 14 * 47 = 1078
                                                        (2 * ( 3 + 4 * 5 + 6) * 7) == 2 * 29 * 7 = 406
                                                        (2 * 3 + (4 * 5 + 6 ) * 7) == 224
                                                        System.out.println(2 * (3 + 4 * (5 + 6 * 7)))

                        ((2 * 3 + 4 * 5 + 6)* 7) == ( 6 + 20 ) * 7 = 182
                        (2 * (3 + 4 * 5 + 6 * 7)) == (23 + 42) * 2 = 130



*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(2 * (3 + 4 * (5 + 6 * 7)));
    }
}
