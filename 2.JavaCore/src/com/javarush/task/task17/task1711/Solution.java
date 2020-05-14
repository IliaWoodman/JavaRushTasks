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

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    create(args);
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    update(args);
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    read(args);
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    delete(args);
                }
                break;
        }
/*        for (int i = 0; i < allPeople.size(); i++) {
            System.out.println(allPeople.get(i).getName());
            System.out.println(allPeople.get(i).getSex());
            System.out.println(allPeople.get(i).getBirthDate());
            System.out.println("_____________________________________");
        }*/
    }

    public static void create(String[] args) throws ParseException {
        //0 |  1     2   3    4     5   6    7     8   9
        //-c|name1 sex1 bd1 name2 sex2 bd2 name3 sex3 bd3...
        // -c Bob м 19/01/1994 Mom ж 22/03/1995 Savana м 25/05/1996
        Person person;
        for (int i = 0; i < args.length - 1; i = i + 3) {
            Date bd = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3 + i]);
            if (args[2 + i].equals("м")) {
                person = Person.createMale(args[1 + i], bd);
                allPeople.add(person);
            } else if (args[2 + i].equals("ж")) {
                person = Person.createFemale(args[1 + i], bd);
                allPeople.add(person);
            }
            System.out.println(allPeople.size() - 1);
        }
    }

    public static void update(String[] args) throws ParseException {
        //0   1    2     3   4   5    6     7   8   9   10    11   12
        //-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 id3 name3 sex3 bd3 ...
        //-u  0 Bob м 21/01/1991 1 Sara ж 22/02/1992 2 John м 23/03/1993
        Person person;
        for (int i = 0; i < args.length - 1; i = i + 4) {
            Date bd = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4 + i]);
            person = allPeople.get(Integer.parseInt(args[1 + i]));
            person.setName(args[2 + i]);
            person.setBirthDate(bd);
            if (args[3 + i].equals("м")) {
                person.setSex(Sex.MALE);
            } else {
                person.setSex(Sex.FEMALE);
            }
        }
    }

    public static void delete(String[] args) throws ParseException {
        //-d id1 id2 id3 id4 ...
        //-d 0 2 4
        Person person;
        for (int i = 1; i < args.length; i++) {
            person = allPeople.get(Integer.parseInt(args[i]));
            person.setSex(null);
            person.setBirthDate(null);
            person.setName(null);
        }
    }

    public static void read(String[] args) throws ParseException {
        //-i id1 id2
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person;
        for (int i = 1; i < args.length; i++) {
            person = allPeople.get(Integer.parseInt(args[i]));
            String name = person.getName();
            String sex = "";
            if (person.getSex() == Sex.MALE) {
                sex = "м";
            } else {
                sex = "ж";
            }
            String data = sdf.format(person.getBirthDate());
            System.out.println(name + " " + sex + " " + data);
        }
    }
}
