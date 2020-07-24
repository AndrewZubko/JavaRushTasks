package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readName = new BufferedReader(new InputStreamReader(System.in));
        String name = readName.readLine();
        readName.close();
        FileInputStream fileReader = new FileInputStream(name);
        ArrayList<Character> list = new ArrayList<>();
        int i = 0;
        while (fileReader.available() > 0){
            Character c = (char)fileReader.read();
            Character c1 = ',';
            if (c == c1){
                i++;
            }
        }
        fileReader.close();
        System.out.println(i);
    }
}
