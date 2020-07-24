package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        reader.close();
        FileInputStream fileReader2 = new FileInputStream(name2);
        FileOutputStream fileWriter1 = new FileOutputStream(name1);
        int i;
        while ((i = fileReader2.read()) != -1){
            fileWriter1.write(i);
        }
        fileWriter1.close();
        fileReader2.close();
        FileOutputStream fileWriter11 = new FileOutputStream(name1, true);
        FileInputStream fileReader3 = new FileInputStream(name3);
        while((i = fileReader3.read()) != -1){
            fileWriter11.write(i);
        }
        fileWriter11.close();
        fileReader3.close();
    }
}
