package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int aa = a - 10;
        if (aa < 0)
            aa = aa * (-1);
        int bb = b - 10;
        if (bb < 0)
            bb = bb * (-1);
        abs (aa);
        abs (bb);
        if (bb > aa) {
            System.out.println(a);
        } else if (aa > bb)
            System.out.println(b);
        else System.out.println(b);

    }

    public static int abs(int a) {

        return a;
    }
}