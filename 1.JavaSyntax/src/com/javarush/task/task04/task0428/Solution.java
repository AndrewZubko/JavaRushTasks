package com.javarush.task.task04.task0428;

/* 
Положительное число
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
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0)
                i++;
        }
        System.out.println(i);


    }
}
