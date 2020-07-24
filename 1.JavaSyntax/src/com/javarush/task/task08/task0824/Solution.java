package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> pchildren = new ArrayList<>(3);
        ArrayList<Human> fchildren = new ArrayList<>(1);
        ArrayList<Human> Mchildren = new ArrayList<>(1);
        ArrayList<Human> Cchildren = new ArrayList<>();
        Human Andrey = new Human("Andrey", true, 20, Cchildren);
        Human Andrey1 = new Human("Andrey1", true, 20, Cchildren);
        Human Andrey2 = new Human("Andrey2", true, 20, Cchildren);
        pchildren.add(Andrey);
        pchildren.add(Andrey1);
        pchildren.add(Andrey2);
        Human Vitia = new Human("Vitia", true, 40, pchildren);
        fchildren.add(Vitia);
        Human Sveta = new Human("Sveta", false, 40, pchildren);
        Mchildren.add(Sveta);
        Human Vasia = new Human("Vasia", true, 60, fchildren);
        Human Grisha = new Human("Grisha", true, 60, Mchildren);
        Human Maria = new Human("Maria", false, 60, fchildren);
        Human Ludmila = new Human("Ludmila", false, 60, Mchildren);

        System.out.println(Vasia.toString());
        System.out.println(Maria.toString());
        System.out.println(Grisha.toString());
        System.out.println(Ludmila.toString());
        System.out.println(Vitia.toString());
        System.out.println(Sveta.toString());
        System.out.println(Andrey.toString());
        System.out.println(Andrey1.toString());
        System.out.println(Andrey2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public  Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public  Human(String name, boolean sex, int age, ArrayList children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


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
