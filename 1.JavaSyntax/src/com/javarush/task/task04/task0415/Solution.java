package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        in.close();
        if (((a + b) > c) && ((b + c) > a) && ((a + c) > b))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}