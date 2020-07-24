package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        if (maximum > 0){
        int i = 0;
        int array[] = new int[maximum];
        for (i = 0; i < maximum; i++) {
            int a = Integer.parseInt(reader.readLine());
            array[i] = a;
        }

        Arrays.sort(array);

        System.out.println(array[maximum-1]);
        }
    }
}
