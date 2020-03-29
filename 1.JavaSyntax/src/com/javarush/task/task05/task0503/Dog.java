package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    //напишите тут ваш код
    String name;
    int age;

    public String getName() {
        return name;
    }
     public void setName(String name){
        this.name = name;
     }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setAge(13);
        System.out.println(dog1.age);
        dog1.setAge(14);
        System.out.println(dog1.age);

        Dog dog2 = new Dog();
        dog2.setName("Buddy");
        dog2.setAge(99);
        System.out.println(dog2.getName());
        System.out.println(dog2.getAge());
    }
}
