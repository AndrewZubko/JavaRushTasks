package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream reader = new FileInputStream(args[0]);
        ArrayList<Character> list = new ArrayList<>();

        while (reader.available() > 0){
            list.add((char)reader.read());
        }

        reader.close();

        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : list){
            if (map.containsKey(c)){
                int i = map.get(c) + 1;
                map.put(c, i);
            }
            else{
                map.put(c, 1);
            }
        }

        ArrayList<Character> employeeByKey = new ArrayList<>(map.keySet());
        Collections.sort(employeeByKey);

        for (Character c : employeeByKey){
            System.out.println(c + " " + map.get(c));
        }
    }
}
