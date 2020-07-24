package com.javarush.task.task05.task0531;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        System.out.println("Minimum = " + min(a, b, c, d, e));



    }


    public static int min(int a, int b, int c, int d, int e) {
        int array[] = new int[5];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;
        array[4] = e;
        Arrays.sort(array);

        return array[0];
    }
}
