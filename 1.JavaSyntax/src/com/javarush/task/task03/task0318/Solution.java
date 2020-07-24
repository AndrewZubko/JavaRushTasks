package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Age = reader.readLine();
        int age = Integer.parseInt(Age);
        String name = reader.readLine();
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");

    }
}
