package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        String grandFatherName = reader.nextLine();
        Cat grandFatherCat = new Cat(grandFatherName);

        String grandMotherName = reader.nextLine();
        Cat grandMotherCat = new Cat(grandMotherName);

        String fatherName = reader.nextLine();
        Cat fatherCat = new Cat(fatherName, null, grandFatherCat);

        String motherName = reader.nextLine();
        Cat motherCat = new Cat(motherName, grandMotherCat, null);

        String sonName = reader.nextLine();
        Cat sonCat = new Cat(sonName, motherCat, fatherCat);

        String daughterName = reader.nextLine();
        Cat daughterCat = new Cat(daughterName, motherCat, fatherCat);

        reader.close();

        System.out.println(grandFatherCat);
        System.out.println(grandMotherCat);
        System.out.println(fatherCat);
        System.out.println(motherCat);
        System.out.println(sonCat);
        System.out.println(daughterCat);
    }

    public static class Cat {
        private String name;
        private Cat parent, parent1;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent, Cat parent1){
            this.name = name;
            this.parent = parent;
            this.parent1 = parent1;
        }

        @Override
        public String toString() {
            if (parent == null && parent1 == null)
                return "The cat's name is " + name + ", no mother, no father ";
            else if (parent == null)
                return "The cat's name is " + name + ", no mother, father is " + parent1.name;
            else if(parent1 == null)
                return "The cat's name is " + name + ", mother is " + parent.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + parent.name + ", father is " + parent1.name;
        }
    }

}
