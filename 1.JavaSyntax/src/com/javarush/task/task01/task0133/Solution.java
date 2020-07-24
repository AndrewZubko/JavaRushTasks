package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        int b = 0;
        for (int i = 0; i <= 30; i++){
            b = i * 60;
        }
        int secondsAfter15 = b;
        System.out.println(secondsAfter15);
    }
}