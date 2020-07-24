package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static int nod(int x1, int x2) {

        int min = 0;
        int n = 1;

        if (x1 < x2) min = x1;
        else min = x2;

        for (int i = min; i >= 1 ; i--) {
            if (x1 % i == 0 && x2 % i == 0) {
                n = i;
                break;
            }
        }
        return n;
    }



    public static void main(String[] args) throws Exception{
        int first;
        int second;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            first = Integer.parseInt(reader.readLine());
            if (first <= 0) throw new Exception();
            second = Integer.parseInt(reader.readLine());
             if (second <= 0) throw new Exception();

        if (first > 0 || second > 0)
            System.out.println(nod(first, second));



    }
}
