package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
// -c Bob м 19/01/1994 Mom ж 22/03/1995 Savana м 25/05/1996
    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        switch (args[0]) {
            case "-c":
                create(args);
                break;
            case "-u":
                System.out.println("qwe");
                break;
        }
        for (int i = 0; i < allPeople.size(); i++) {
            System.out.println(allPeople.get(i).getName());
            System.out.println(allPeople.get(i).getSex());
            System.out.println(allPeople.get(i).getBirthDate());
            System.out.println("_____________________________________");
        }
    }

    public static void create(String[] args) throws ParseException {
        //0 |  1     2   3    4     5   6    7     8   9
        //-c|name1 sex1 bd1 name2 sex2 bd2 name3 sex3 bd3...
        int size = (args.length - 1) / 3; // = 3
        Person person;
//0 3 6 9
        for (int i = 0; i < args.length-1; i = i + 3) {
            Date bd = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3 + i]);
            if (args[2 + i].equals("м")) {
                person = Person.createMale(args[1 + i], bd);
                allPeople.add(person);
                System.out.println(allPeople.size()-1);
            } else if (args[2 + i].equals("ж")) {
                person = Person.createMale(args[1 + i], bd);
                allPeople.add(person);
                System.out.println(allPeople.size()-1);

            }
        }
    }
}
