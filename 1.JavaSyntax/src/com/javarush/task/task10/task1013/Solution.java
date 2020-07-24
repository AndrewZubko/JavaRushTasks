package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String lastName;
        private String city;
        private int age;
        private boolean sex;
        private String race;

        public Human(String firstName){
            this.firstName = firstName;
        }
        public Human(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public Human(String firstName, String lastName, String city){
            this.firstName = firstName;
            this.lastName = lastName;
            this.city = city;
        }
        public Human(String firstName, String lastName, String city, int age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.city = city;
            this.age = age;
        }
        public Human(String firstName, String lastName, String city, int age, boolean sex){
            this.firstName = firstName;
            this.lastName = lastName;
            this.city = city;
            this.age = age;
            this.sex = sex;
        }
        public Human(String firstName, String lastName, String city, int age, boolean sex, String race){
            this.firstName = firstName;
            this.lastName = lastName;
            this.city = city;
            this.age = age;
            this.sex = sex;
            this.race = race;
        }
        public Human(String firstName, String lastName, int age, boolean sex, String race){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.race = race;
        }
        public Human(String firstName, String lastName, String city, boolean sex, String race){
            this.firstName = firstName;
            this.lastName = lastName;
            this.city = city;
            this.sex = sex;
            this.race = race;
        }
        public Human(String firstName, String lastName, boolean sex, String race){
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.race = race;
        }
        public Human(String firstName, int age, boolean sex, String race){
            this.firstName = firstName;
            this.age = age;
            this.sex = sex;
            this.race = race;
        }
    }
}
