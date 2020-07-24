package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        double t = in.nextDouble();
        in.close();
        // проверка минут
        double tt = 0;
        boolean tr = true;
        for (int i = 0; tr = true ; i += 5) {
            tt = t - i;
            if (tt >= 0 && tt < 5){
                tr = false;
                break;
            }
        }
        if (tt >= 0 && tt < 3)
            System.out.println("зелёный");
        else if (tt >= 3 && tt < 4)
            System.out.println("жёлтый");
        else if (tt >= 4 && tt < 5)
            System.out.println("красный");
    }
}