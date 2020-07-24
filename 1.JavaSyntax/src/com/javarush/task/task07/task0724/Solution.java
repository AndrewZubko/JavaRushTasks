package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human Vasia = new Human("Vasia", true, 60);
        Human Grisha = new Human("Grisha", true, 70);
        Human Marina = new Human("Marina", false, 55);
        Human Luda = new Human("Luda", false, 70);
        Human Vitia = new Human("Vitia", true, 40, Vasia, Marina);
        Human Sveta = new Human("Sveta", false, 40, Grisha, Luda);
        Human Illia = new Human("Illia", true, 11, Vitia, Sveta);
        Human Andrey = new Human("Andrey", true, 21, Vitia, Sveta);
        Human Nastia = new Human("Nastia", true, 20, Vitia, Sveta);
        System.out.println(Vasia.toString());
        System.out.println(Grisha.toString());
        System.out.println(Marina.toString());
        System.out.println(Luda.toString());
        System.out.println(Vitia.toString());
        System.out.println(Sveta.toString());
        System.out.println(Illia.toString());
        System.out.println(Andrey.toString());
        System.out.println(Nastia.toString());





    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
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
        }
    }
}