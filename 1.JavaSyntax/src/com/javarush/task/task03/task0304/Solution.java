package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double j = i * 0.1 + i;
        return j;

    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
