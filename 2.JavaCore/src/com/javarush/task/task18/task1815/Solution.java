package com.javarush.task.task18.task1815;

import java.io.*;
import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        TableInterface tableInterface;

        public TableInterfaceWrapper(TableInterface tableInterface) {
            this.tableInterface = tableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            tableInterface.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return tableInterface.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tableInterface.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) throws IOException {
        System.out.println();
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/ilya.romanenko/Desktop/result.txt", true);
        FileInputStream fileInputStream = new FileInputStream("asd");
        String greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!\r\n";
        fileOutputStream.write(greetings.getBytes());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        fileOutputStream.close();
    }
}