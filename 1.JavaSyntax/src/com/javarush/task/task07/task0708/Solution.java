package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
//        strings = new ArrayList<String>();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        for (int i = 0; i < 5; i++) {
//            strings.add(reader.readLine());
//        }
//        int a = strings.get(0).length();
//        int b = 0;
//        ArrayList<String> stringout = new ArrayList<String>();
//        for (int i = 1; i < strings.size(); i++) {
//            if (a < strings.get(i).length()){
//                a = strings.get(i).length();
//                for (int j = 0; j < stringout.size(); j++) {
//                    stringout.remove(0);
//                }
//                b = i;
//            }
//            else if (a == strings.get(i).length()){
//                stringout.add(strings.get(i));
//            }
//        }
//        stringout.add(0, strings.get(b));
//        if (stringout.size() >= 2){
//            for (int i = 0; i < stringout.size(); i++) {
//                System.out.println(stringout.get(i));
//            }
//        }
//           else
//               System.out.println(strings.get(b));
        strings = new ArrayList<String>();
        Scanner kbd = new Scanner(System.in);
        //searching max length of strings in array
        int maxLength = 0, tmax = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(i, kbd.nextLine());
            if (strings.get(i).length() > maxLength) {
                maxLength = strings.get(i).length();
            }
        }

        // searching duplicate of max length
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == maxLength)
                System.out.println(strings.get(i));
        }
    }
}
