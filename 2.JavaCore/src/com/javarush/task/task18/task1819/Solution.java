package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();

        FileInputStream fileReader1 = new FileInputStream(name1);
        int i;
        ArrayList<Integer> list = new ArrayList<>();
        while((i = fileReader1.read()) != -1){
            list.add(i);
        }
        fileReader1.close();

        FileOutputStream fileWriter1 = new FileOutputStream(name1);
        FileInputStream fileReader2 = new FileInputStream(name2);

        while((i = fileReader2.read()) != -1){
            fileWriter1.write(i);
        }
        for (Integer j : list){
            fileWriter1.write(j);
        }
        fileWriter1.close();
        fileReader2.close();
    }
}
