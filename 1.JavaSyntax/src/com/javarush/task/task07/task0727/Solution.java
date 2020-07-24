package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            list.add(string);
        }

        /*ArrayList<String> resultStrings = new ArrayList<String>();

        for (int i = 0; i < strings.size(); i++) {
           if (strings.get(i).length() % 2 == 0){
               for (int j = 0; j < 2; j++) {
                   resultStrings.add(strings.get(i));
               }
           }
           else {
               for (int j = 0; j < 3; j++) {
                   resultStrings.add(strings.get(i));
               }
           }
        }
        if (resultStrings.size() >= 1) {
            String s = resultStrings.get(0);
            System.out.print(s);
            for (int i = 1; i < resultStrings.size(); i++) {
                if (resultStrings.get(i).equals(s)) {
                    s = resultStrings.get(i);
                    System.out.print(" " + s);
                } else {
                    s = resultStrings.get(i);
                    System.out.println();
                    System.out.print(s);
                }
            }
        }
        if (resultStrings.size() != 0){
            System.out.println();
        }*/
        ArrayList<String> multiply = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) {
                multiply.add(list.get(i) + " " + list.get(i));
            } else {
                multiply.add(list.get(i) + " " + list.get(i) + " " + list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(multiply.get(i));
        }
    }
}
