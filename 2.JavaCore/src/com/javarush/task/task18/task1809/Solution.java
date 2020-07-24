package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readName = new BufferedReader(new InputStreamReader(System.in));
        String name1 = readName.readLine();
        String name2 = readName.readLine();
        readName.close();

        FileInputStream inputStream = new FileInputStream(name1);
        FileOutputStream outputStream = new FileOutputStream(name2);
        if (inputStream.available() > 0){
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            for (int i = buffer.length - 1; i >= 0; i--) {
                outputStream.write(buffer[i]);
            }
        }
        inputStream.close();
        outputStream.close();
    }
}
