package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner ins = new Scanner(System.in);
        String s = ins.nextLine();
        return s;

    }

    public static int readInt() throws Exception {
        Scanner ini = new Scanner(System.in);
        int i = ini.nextInt();
        return i;
    }

    public static double readDouble() throws Exception {
        Scanner ind = new Scanner(System.in);
        double d = ind.nextDouble();
        return d;

    }

    public static boolean readBoolean() throws Exception {
        Scanner inb = new Scanner(System.in);
        boolean b = inb.nextBoolean();
        return b;

    }

    public static void main(String[] args) throws Exception {
    }
}
