package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader readName = new BufferedReader(new InputStreamReader(System.in));
        String fileName = readName.readLine();
        readName.close();
        ArrayList<Byte> list = new ArrayList<>();
        FileInputStream readStream = new FileInputStream(fileName);
        while (readStream.available() > 0){
            list.add((byte)readStream.read());
        }
        readStream.close();
        HashMap<Byte, Integer> hm = new HashMap<>();
        for (Byte i: list){
            hm.put(i, 1);
        }
        list.clear();
        for (Map.Entry<Byte, Integer> entry : hm.entrySet()){
            Byte b = entry.getKey();
            list.add(b);
        }
        Collections.sort(list);
        for (Byte i: list){
            System.out.print(i + " ");
        }
    }
}
