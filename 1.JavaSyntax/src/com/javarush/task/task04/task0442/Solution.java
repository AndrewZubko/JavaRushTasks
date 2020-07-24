package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        boolean tr = true;
        for (int i = 0; tr ; i++) {
            int a = in.nextInt();
            sum += a;
            if (a == -1){
                tr = false;
                System.out.print(sum);
            }

        }

    }
}
