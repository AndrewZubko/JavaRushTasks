package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
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
        ArrayList<Byte> fileByte = new ArrayList<>();
        FileInputStream readFile = new FileInputStream(fileName);
        while (readFile.available() > 0){
            fileByte.add((byte)readFile.read());
        }
        readFile.close();
        HashMap<Byte, Integer> hm = new HashMap<>();
        Integer am;
        for (Byte i: fileByte){
            am = hm.get(i);
            hm.put(i, am == null ? 1 : am + 1);
        }
        for (Map.Entry<Byte, Integer> entry : hm.entrySet()){
            Byte key = entry.getKey();
            Integer value = entry.getValue();
            if (value == 1){
                System.out.print(key +" ");
            }
        }
    }
}
