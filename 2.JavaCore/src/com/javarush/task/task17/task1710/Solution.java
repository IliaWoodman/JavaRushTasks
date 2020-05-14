package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


/*
CRUD
*/
public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

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
    }

    public static void create(String[] args) throws ParseException {
        Person person;
        Date bd = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3]);

        if ("м".equals(args[2])) {
            person = Person.createMale(args[1], bd);
            allPeople.add(person);
        } else {
            person = Person.createFemale(args[1], bd);
            allPeople.add(person);
        }
        System.out.println(allPeople.size() - 1);
    }

    public static void update(String[] args) throws ParseException {
        Person person = allPeople.get(Integer.parseInt(args[1]));
        person.setName(args[2]);
        if ("м".equals(args[3]))
            person.setSex(Sex.MALE);
        else person.setSex(Sex.FEMALE);

        Date bd = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]);
        person.setBirthDate(bd);
    }

    public static void read(String[] args) throws ParseException {
        Person person = allPeople.get(Integer.parseInt(args[1]));
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        System.out.print(person.getName());
        System.out.print(" ");
        if (Sex.MALE.equals(person.getSex())) {
            System.out.print("м");
            System.out.print(" ");
        } else {
            System.out.print("ж");
            System.out.print(" ");
        }

        System.out.print(sdf.format(person.getBirthDate()));

    }

    public static void delete(String[] args) {
        Person person = allPeople.get(Integer.parseInt(args[1]));
        person.setName(null);
        person.setBirthDate(null);
        person.setSex(null);
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////


/*
public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static Date changeDateFormant(String date) {
        Date resData = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        try {
            Date date1 = dateFormat.parse(date);
            resData = date1;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resData;
    }

    public static void main(String[] args) throws IOException, ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        /////////////////////////////////add person////////////////////////////////////////////////
        if (args[0].equals("-c")) {
            if (args[2].equals("м")) {
                allPeople.add(Person.createMale(args[1], changeDateFormant(args[3])));
                System.out.println(allPeople.size() - 1);

            } else if (args[2].equals("ж")) {
                allPeople.add(Person.createFemale(args[1], changeDateFormant(args[3])));
                System.out.println(allPeople.size() - 1);
            }
        }
        //////////////////////////////update person//////////////////////////////////////////////////////////
        //0   1   2   3   4
        //-u id name sex bd
        //-u 1 Bobysk ж 22/03/1994
        if (args[0].equals("-u")) {
            if (args[3].equals("м")) {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
                allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(changeDateFormant(args[4]));
                //allPeople.add(Integer.parseInt(args[1]), Person.createMale(args[2], changeDateFormant(args[4])));
            } else if (args[3].equals("ж")) {
                //allPeople.add(Integer.parseInt(args[1]), Person.createFemale(args[2], changeDateFormant(args[4])));
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
                allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(changeDateFormant(args[4]));
            }
        }
        //////////////////////////////delete person///////////////////////////////////////////////////////
        if (args[0].equals("-d")) {
            allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);

            System.out.println(allPeople.get(Integer.parseInt(args[1])).getBirthDate());
            System.out.println(allPeople.get(Integer.parseInt(args[1])).getName());
            System.out.println(allPeople.get(Integer.parseInt(args[1])).getSex());
        }
        ///////////////////////////////////////////select person/////////////////////////////////////
        if (args[0].equals("-i")) {
            String name = allPeople.get(Integer.parseInt(args[1])).getName();
            String sex = "";
            if (allPeople.get(Integer.parseInt(args[1])).getSex() == Sex.MALE) {
                sex = "м";
            } else {
                sex = "ж";
            }
            String Bday = dateFormat.format(allPeople.get(Integer.parseInt(args[1])).getBirthDate());
            System.out.println(name + " " + sex + " " + Bday);
        }

        System.out.println(allPeople.get(1).getSex());
        System.out.println(allPeople.get(1).getName());
        System.out.println(dateFormat.format(allPeople.get(1).getBirthDate()));
    }
}
*/
