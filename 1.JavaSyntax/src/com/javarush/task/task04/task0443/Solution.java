package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int y = in.nextInt();
        int m = in.nextInt();
        int d = in.nextInt();
        in.close();
        System.out.print("Меня зовут " + name + ".\n" +
                "Я родился " + d + "." + m + "." + y);

    }
}
