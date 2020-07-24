package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg a1 = new Zerg();
        a1.name = "a1";
        Zerg a2 = new Zerg();
        a2.name = "a2";
        Zerg a3 = new Zerg();
        a3.name = "a3";
        Zerg a4 = new Zerg();
        a4.name = "a4";
        Zerg a5 = new Zerg();
        a5.name = "a5";
        Protoss b1 = new Protoss();
        b1.name = "b1";
        Protoss b2 = new Protoss();
        b2.name = "b2";
        Protoss b3 = new Protoss();
        b3.name = "b3";
        Terran c1 = new Terran();
        c1.name = "c1";
        Terran c2 = new Terran();
        c2.name = "c2";
        Terran c3 = new Terran();
        c3.name = "c3";
        Terran c4 = new Terran();
        c4.name = "c4";

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
