package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String First = reader.readLine();
        String Second = reader.readLine();
        int first = Integer.parseInt(First);
        int second = Integer.parseInt(Second);
        System.out.println(name + " получает " + first + " через " + second + " лет.");

    }
}
