package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arr = new String[2];
        Scanner in = new Scanner(System.in);
        arr[0] = in.nextLine();
        arr[1] = in.nextLine();
        in.close();

        boolean eq = arr[0].equals(arr[1]);
        if (eq)
            System.out.println("Имена идентичны");
        else {
            int s1 = arr[0].length();
            int s2 = arr[1].length();
            if (s1 == s2){
                System.out.println("Длины имен равны");
            }
        }

    }
}
