package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat formater1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formater2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        String d = in.nextLine();
        Date date = formater1.parse(d);
//        System.out.println(date);
        System.out.println(formater2.format(date).toUpperCase());
    }
}
