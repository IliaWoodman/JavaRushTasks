package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human fatherDed = new Human("Леха", true, 93);
        Human motherDed = new Human("Steven", true, 89);
        Human fatherBabka = new Human("Olga", false, 87);
        Human motherBabka = new Human("Natasha", false, 90);
        Human father = new Human("Dima", true, 45, fatherDed,fatherBabka);
        Human mother = new Human("Ksenia", false, 42, motherDed,motherBabka);
        Human firstChild = new Human("Oleg", true, 21, father,mother);
        Human secondChild = new Human("Diana", false, 27, father,mother);
        Human thirdChild = new Human("Anastasia", false, 18, father,mother);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

/*        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }*/
public Human(String name, boolean sex, int age){
    String text = "";
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.father = father;
    this.mother = mother;
    text = text + "Имя: " + this.name;
    text = text + ", пол: " + (this.sex ? "мужской" : "женский");
    text = text + ", возраст: " + this.age;

    if (this.father != null) {
        text += ", отец: " + this.father.name;
    }

    if (this.mother != null) {
        text += ", мать: " + this.mother.name;
    }
    System.out.println(text);

}

        public Human(String name, boolean sex, int age, Human father, Human mother){
            String text = "";
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            text = text + "Имя: " + this.name;
            text = text + ", пол: " + (this.sex ? "мужской" : "женский");
            text = text + ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            System.out.println(text);

        }
    }
}