package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] bigarray = new int[20];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < bigarray.length; i++) {
            bigarray[i] = in.nextInt();
        }
        int[] startarray = new int[10];
        int[] endarray = new int[10];
        for (int i = 0; i < startarray.length; i++) {
            startarray[i] = bigarray[i];
            endarray[i] = bigarray[i + 10];
            System.out.println(endarray[i]);
        }

    }
}
