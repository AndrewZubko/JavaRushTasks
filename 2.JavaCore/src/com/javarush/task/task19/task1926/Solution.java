package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader fileReader = new BufferedReader(new FileReader("C:\\Users\\andre\\Desktop\\test1.txt"));
        BufferedReader fileReader = new BufferedReader(new FileReader(nameReader.readLine()));
        nameReader.close();

        while(fileReader.ready()){
            String line = fileReader.readLine();
            char[] lineLetter = line.toCharArray();
            for (int i = lineLetter.length - 1; i >= 0; i--) {
                System.out.print(lineLetter[i]);
            }
            System.out.println();
        }
        fileReader.close();
    }
}
