package com.javarush.task.task04.task0404;

/* 
Учет котов
*/

public class Cat {
    private static int catsCount = 0;


    public static void addNewCat() {
        catsCount++;

    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println(catsCount);
        Cat cat2 = new Cat();
        System.out.println(catsCount);
    }
}
