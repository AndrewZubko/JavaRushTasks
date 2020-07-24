package com.javarush.task.task04.task0419;
import java.util.*;
/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Integer[] arr = new Integer[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int a = in.nextInt();
            arr[i] = a;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[0]);

    }
}
