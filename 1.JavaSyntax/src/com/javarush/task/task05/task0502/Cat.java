package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        boolean weightb = weight > anotherCat.weight;
        boolean ageb = age > anotherCat.age;
        boolean strengthb = strength > anotherCat.strength;
//        if (ageb && weightb || ageb && strengthb || weightb && strengthb)
//            return true;
//        else
//            return false;
//        int c1 = 0;
//        if (ageb)
//            c1++;
//        if (weightb)
//            c1++;
//        if (strengthb)
//            c1++;
//        if (c1 > 0)
//            return true;
//        else
//            return false;
        int counter = 0;
        int counter2 = 0;
        if (anotherCat.age < this.age){
            counter++;
        }
        else if ( this.age < anotherCat.age){
            counter2++;
        }
        if(anotherCat.weight < this.weight){
            counter++;
        }
        else if ( this.weight < anotherCat.weight){
            counter2++;
        }

        if(anotherCat.strength < this.strength){
            counter++;
        }
        else if ( this.strength  < anotherCat.strength){
            counter2++;
        }


        if (counter > counter2){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.strength = 12;
        cat1.weight = 12;
        cat1.age = 11;

        Cat cat2 = new Cat();
        cat2.strength = 13;
        cat2.weight = 13;
        cat2.age = 11;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
