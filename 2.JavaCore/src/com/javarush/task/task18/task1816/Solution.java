package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int symvol = reader.read();
        int i = 0;
        ArrayList<Character> list = new ArrayList<>();
        while(symvol != -1){
            list.add((char) symvol);
            symvol = reader.read();
        }
        reader.close();
        for(char c: list){
            int index = alp.indexOf(c);
            if (index != -1)
                i++;
        }
        System.out.println(i);
    }
}
