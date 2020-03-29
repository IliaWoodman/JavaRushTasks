package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(dateFormat.parse(date));
        if (calendar.get(Calendar.DAY_OF_YEAR) % 2 == 0) {
            return false;
        }
        return true;
    }
}
