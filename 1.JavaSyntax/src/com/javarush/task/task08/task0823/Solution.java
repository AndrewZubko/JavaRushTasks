package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] chars = string.toCharArray();
        String[] charStrings = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
           charStrings[i] = "" + chars[i];
        }
        charStrings[0] = charStrings[0].toUpperCase();
        for (int i = 0; i < charStrings.length; i++) {
            if (charStrings[i].equals(" ")){
                charStrings[i + 1] = charStrings[i + 1].toUpperCase();
            }
        }
        for (int i = 0; i < charStrings.length; i++) {
            System.out.print(charStrings[i]);
        }


        //напишите тут ваш код
    }
}
