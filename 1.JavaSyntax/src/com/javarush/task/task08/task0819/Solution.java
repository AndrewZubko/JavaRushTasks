package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        for (Cat cat: cats){
            cats.remove(cat);
            break;
        }

        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> sCat = new HashSet<Cat>();
        Cat cat1 = new Cat();
        sCat.add(cat1);
        Cat cat2 = new Cat();
        sCat.add(cat2);
        Cat cat3 = new Cat();
        sCat.add(cat3);
        return sCat;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat: cats){
            System.out.println(cat);
        }
    }

    public static class Cat{

    }
}
