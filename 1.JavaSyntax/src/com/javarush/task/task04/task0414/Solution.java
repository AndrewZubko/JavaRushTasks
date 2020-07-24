package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        in.close();
        int a = year % 400;
        int b = year % 4;
        int c = year % 100;
        if (a == 0)
            System.out.println("количество дней в году: 366");
         else if (c == 0)
             System.out.println("количество дней в году: 365");
         else if (b == 0)
            System.out.println("количество дней в году: 366");
         else
            System.out.println("количество дней в году: 365");

    }
}