package com.javarush.task.task14.task1419;

import com.sun.org.apache.xerces.internal.impl.xpath.XPathException;
import sun.reflect.annotation.ExceptionProxy;

import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.IllegalFormatFlagsException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e){
            exceptions.add(e);
        } Exception e2 = new NullPointerException();
        exceptions.add(e2);
        Exception e4 = new ExportException("asd");
        exceptions.add(e4);
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new InstantiationException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new IllegalFormatFlagsException("asda"));
        exceptions.add(new XPathException());

        //напишите тут ваш код

    }
}
