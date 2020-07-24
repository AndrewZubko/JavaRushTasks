package com.javarush.task.task05.task0529;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        boolean b = true;
        int sum = 0;
        for (int i = 0; b ; i++) {
            String s = in.nextLine();
            if (s.equals("сумма")){
                System.out.println(sum);
                b = false;
            }
            else {
                int a = Integer.parseInt(s);
                sum += a;
            }

        }
        in.close();
    }
}
