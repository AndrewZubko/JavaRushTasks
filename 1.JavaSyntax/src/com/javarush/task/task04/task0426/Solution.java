package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a > 0){
            int a1 = a % 2;
            if (a1 == 0)
                System.out.println("положительное четное число");
            else
                System.out.println("положительное нечетное число");
        }
        else if (a < 0){
            int a1 = a % 2;
            if (a1 == 0)
                System.out.println("отрицательное четное число");
            else
                System.out.println("отрицательное нечетное число");
        }
        else
            System.out.println("ноль");


    }
}
