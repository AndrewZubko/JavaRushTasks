package com.javarush.task.task32.task3210;

/* 
Используем RandomAccessFile
*/

import java.io.RandomAccessFile;
import java.nio.charset.Charset;

public class Solution {
    public static void main(String... args) {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];
        int textLen = text.length();
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            raf.seek(number);
            byte[] j = new byte[textLen];
            raf.read(j, 0, textLen);
            String fileLine = new String(j, Charset.defaultCharset());
            raf.seek(raf.length());
            if (text.equals(fileLine)){
                raf.write("true".getBytes());
            } else {
                raf.write("false".getBytes());
            }
        } catch (Exception e) {
        }
    }
}
