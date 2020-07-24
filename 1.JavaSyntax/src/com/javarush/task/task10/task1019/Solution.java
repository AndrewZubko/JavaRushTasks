package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        while (true){
            String num = reader.readLine();
            if (num.isEmpty())
                break;
            int num1 = Integer.parseInt(num);
            String word = reader.readLine();
            if (word.isEmpty()){
                map.put("", num1);
                break;
            }
            map.put(word, num1);
        }
        for (HashMap.Entry<String, Integer> pair: map.entrySet()){
            String key = pair.getKey();
            int value = pair.getValue();
            System.out.println(value + " " + key);

        }
    }
}
