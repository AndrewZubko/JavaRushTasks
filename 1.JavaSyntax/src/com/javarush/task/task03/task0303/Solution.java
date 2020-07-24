package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        double doll;
        doll = convertEurToUsd(100, 2.5);
        System.out.println(doll);
        doll = convertEurToUsd(200, 3.5);
        System.out.println(doll);



    }

    public static double convertEurToUsd(int eur, double course) {
        double d = eur * course;
        return d;

    }
}
