package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        in.close();
        if (i > 0){
            i *= 2;
            System.out.println(i);
        }
        else if (i < 0){
            i++;
            System.out.println(i);
        }
        else System.out.println(i);

    }

}