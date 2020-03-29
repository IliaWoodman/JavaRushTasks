package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static class Cat{}
    public static class Dog{}
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        //напишите тут ваш код

        return cats;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<>();
        for(Object pet : cats){
            pets.add(pet);
        }
        for (Object pet : dogs){
            pets.add(pet);
        }
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Set<Object> copyPets = new HashSet<>(pets);
        Set<Cat> copyCats = new HashSet<>(cats);
        for (Object cat: copyCats){
            pets.remove(cat);
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object pet: pets){
            System.out.println(pet);
        }
    }

    //напишите тут ваш код
}
