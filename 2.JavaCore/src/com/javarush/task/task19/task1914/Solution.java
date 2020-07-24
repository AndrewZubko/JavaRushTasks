package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(printStream);
        String string = outputStream.toString().trim();
        String[] strMas = string.split(" ");
        int x;
        switch (strMas[1]) {
            case "+":
                x = Integer.parseInt(strMas[0]) + Integer.parseInt(strMas[2]);
                break;
            case "-":
                x = Integer.parseInt(strMas[0]) - Integer.parseInt(strMas[2]);
                break;
            case "*":
                x = Integer.parseInt(strMas[0]) * Integer.parseInt(strMas[2]);
                break;
            default:
                x = -1;
                break;
        }
        System.out.println(string + " " + x);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

