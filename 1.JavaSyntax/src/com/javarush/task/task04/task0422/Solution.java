package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int age = in.nextInt();
        in.close();
        if (age < 18)
            System.out.println("Подрасти еще");

    }
}
