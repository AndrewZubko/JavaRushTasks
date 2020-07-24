package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.close();
        String a1 = Integer.toString(a);
        int a2 = a1.length();
        if (a >= 1 && a <= 999) {
            int a3 = a % 2;
            if (a3 == 0) {
                switch (a2) {
                    case 1:
                        System.out.println("четное однозначное число");
                        break;
                    case 2:
                        System.out.println("четное двузначное число");
                        break;
                    case 3:
                        System.out.println("четное трехзначное число");
                        break;
                }

            } else {
                switch (a2) {
                    case 1:
                        System.out.println("нечетное однозначное число");
                        break;
                    case 2:
                        System.out.println("нечетное двузначное число");
                        break;
                    case 3:
                        System.out.println("нечетное трехзначное число");
                        break;
                }
            }

        }

    }
}