package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        int a = 0, b = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0)
                a++;
            else if (arr[j] < 0)
                    b++;

        }
        System.out.println("количество положительных чисел: " + a);
        System.out.println("количество отрицательных чисел: " + b);


    }
}
