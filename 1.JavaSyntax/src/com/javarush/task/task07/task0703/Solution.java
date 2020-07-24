package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] sarray = new String[10];
        int[] array = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < sarray.length; i++) {
            sarray[i] = in.nextLine();
            array[i] = sarray[i].length();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
