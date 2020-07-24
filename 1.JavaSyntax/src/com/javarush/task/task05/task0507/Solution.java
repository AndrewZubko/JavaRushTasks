package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        boolean b = true;
        double number = 0, sum = 0, reply = 0;
        for (int i = 1; b ; i++) {
            number = in.nextDouble();
            if(number == -1){
                b = false;
                break;
            }
            sum += number;
            reply = sum / i;
        }
        System.out.println(reply);
    }
}

