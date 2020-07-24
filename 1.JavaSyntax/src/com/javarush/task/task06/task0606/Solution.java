package com.javarush.task.task06.task0606;

import java.io.*;
import java.sql.SQLOutput;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int N = sNum.length();
        int num = Integer.parseInt(sNum);
       // System.out.println(num);
        int[] nums = new int[N];
        for (int i = 0; i < N ; i++) {
            int a = num % 10;
            nums [i] = a;
            num /= 10;
            if (nums[i] % 2 ==0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
