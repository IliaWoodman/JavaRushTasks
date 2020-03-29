package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "q";

        Zerg zerg2 = new Zerg();
        zerg2.name = "w";

        Zerg zerg3 = new Zerg();
        zerg3.name = "e";

        Zerg zerg4 = new Zerg();
        zerg4.name = "r";

        Zerg zerg5 = new Zerg();
        zerg5.name = "t";

        Protoss prot1 = new Protoss();
        prot1.name = "a";

        Protoss prot2 = new Protoss();
        prot2.name = "s";

        Protoss prot3 = new Protoss();
        prot3.name = "d";

        Terran ter1 = new Terran();
        ter1.name = "z";

        Terran ter2 = new Terran();
        ter2.name = "x";

        Terran ter3 = new Terran();
        ter3.name = "c";

        Terran ter4 = new Terran();
        ter4.name = "v";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
