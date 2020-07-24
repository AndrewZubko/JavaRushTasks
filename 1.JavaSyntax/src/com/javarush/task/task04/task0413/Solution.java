package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        in.close();
        if (i == 1)
            System.out.print("понедельник");
        else if (i == 2)
            System.out.print("вторник");
        else if (i == 3)
            System.out.print("среда");
        else if (i == 4)
            System.out.print("четверг");
        else if (i == 5)
            System.out.print("пятница");
        else if (i == 6)
            System.out.print("суббота");
        else if (i == 7)
            System.out.print("воскресенье");
        else
            System.out.println("такого дня недели не существует");

    }
}