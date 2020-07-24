package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        if ((c != b) && (a == b))
            System.out.println(3);
        else if ((b != a) && (a == c))
            System.out.println(2);
        else if ((a != b) && (b == c))
            System.out.println(1);

        }

    }

