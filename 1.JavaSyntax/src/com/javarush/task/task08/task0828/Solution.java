package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    ArrayList<String> list = new ArrayList<String>(12);
    list.add("January");
    list.add("February");
    list.add("March");
    list.add("April");
    list.add("May");
    list.add("June");
    list.add("July");
    list.add("August");
    list.add("September");
    list.add("October");
    list.add("November");
    list.add("December");
    Scanner in = new Scanner(System.in);
    String m = in.nextLine();
    in.close();
    int i = list.indexOf(m);
    System.out.println(m + " is the " + (i + 1) + " month");
    }
}
