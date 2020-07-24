package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        int part = a > 0 ? (b > 0 ? 1 : 4) : (b > 0 ? 2 : 3);
        System.out.println(part);

    }
}
