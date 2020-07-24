package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean ab = a == b;
        boolean bc = b == c;
        boolean ac = a == c;
        if ( ab && bc && ac)
            System.out.println(a + " " + b + " " + c);
        else if (ab)
            System.out.println(a  + " " + b);
        else if (bc)
            System.out.println(b + " " + c);
        else if (ac)
            System.out.println(a  + " " + c);

    }
}