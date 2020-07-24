package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution  {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileReader = new FileInputStream(reader.readLine());
        while (fileReader.available() > 0){
            int date = fileReader.read();
            char ch = (char) date;
            System.out.print(ch);
        }
        fileReader.close();
        reader.close();
    }
}