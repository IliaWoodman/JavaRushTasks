package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш
        Human firstChild = new Human();
        firstChild.sex = true;
        firstChild.name = "Vasya";
        firstChild.age = 12;
        firstChild.children = new ArrayList<>() ;

        Human secondChild = new Human();
        secondChild.sex = false;
        secondChild.name = "Olya";
        secondChild.age = 22;
        secondChild.children = new ArrayList<>() ;

        Human thirdChild = new Human();
        thirdChild.sex = true;
        thirdChild.name = "Dima";
        thirdChild.age = 18;
        thirdChild.children = new ArrayList<>();

        Human father = new Human();
        father.name = "Batya";
        father.age = 43;
        father.sex = true;
        father.children = new ArrayList<>();
        father.children.add(firstChild);
        father.children.add(secondChild);
        father.children.add(thirdChild);

        Human mother = new Human();
        mother.name = "Mama";
        mother.age = 34;
        mother.sex = false;
        mother.children = new ArrayList<>();
        mother.children.add(firstChild);
        mother.children.add(secondChild);
        mother.children.add(thirdChild);

        Human grandfather1 = new Human();
        grandfather1.name = "Ded1";
        grandfather1.age = 87;
        grandfather1.sex = true;
        grandfather1.children = new ArrayList<>();
        grandfather1.children.add(father);

        Human grangmother1 = new Human();
        grangmother1.name = "Babka1";
        grangmother1.age = 89;
        grangmother1.sex = false;
        grangmother1.children = new ArrayList<>();
        grangmother1.children.add(father);

        Human grandfather2 = new Human();
        grandfather2.name = "Ded2";
        grandfather2.age = 77;
        grandfather2.sex = true;
        grandfather2.children = new ArrayList<>();
        grandfather2.children.add(mother);

        Human grangmother2 = new Human();
        grangmother2.name = "Babka2";
        grangmother2.age = 79;
        grangmother2.sex = false;
        grangmother2.children = new ArrayList<>();
        grangmother2.children.add(mother);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grangmother1);
        System.out.println(grangmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(firstChild);
        System.out.println(secondChild);
        System.out.println(thirdChild);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
