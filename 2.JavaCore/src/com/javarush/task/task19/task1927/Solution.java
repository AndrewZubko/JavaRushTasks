package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(byteStream);
        System.setOut(myStream);
        testString.printSomething();
        System.setOut(console);

        String line = byteStream.toString();
        String[] buf = line.split("\n");
        for (int i = 0; i < buf.length; i++) {
            if (i == 2 || i == 4 || i == 6){
                System.out.println("JavaRush - курсы Java онлайн");
                System.out.println(buf[i]);
            }
            else System.out.println(buf[i]);
        }
                
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
