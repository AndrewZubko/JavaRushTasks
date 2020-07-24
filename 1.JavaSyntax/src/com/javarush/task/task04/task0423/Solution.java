package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int age = in.nextInt();
        in.close();
        if (age > 20)
            System.out.println("И 18-ти достаточно");

    }
}
