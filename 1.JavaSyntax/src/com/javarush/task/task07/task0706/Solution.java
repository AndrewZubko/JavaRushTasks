package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] array = new int[15];
        Scanner in = new Scanner(System.in);
        int a = 0, b = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            if(i % 2 == 0)
                b += array[i];
            else
                a += array[i];
        }
        in.close();
        System.out.println(a > b ? "В домах с нечетными номерами проживает больше жителей." : "В домах с четными номерами проживает больше жителей.");
    }
}
