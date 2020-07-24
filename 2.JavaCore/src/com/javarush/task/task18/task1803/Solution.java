package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader readName = new BufferedReader(new InputStreamReader(System.in));
        String fileName = readName.readLine();
        readName.close();
        ArrayList<Byte> list = new ArrayList<>();
        FileInputStream readFile = new FileInputStream(fileName);
        while (readFile.available() > 0){
            list.add((byte)readFile.read());
        }
        readFile.close();
        HashMap<Byte, Integer> hm = new HashMap<>();
        Integer am;
        for (Byte i: list){
            am = hm.get(i);
            hm.put(i, am == null ? 1 : am + 1);
        }
        int j = list.size() - 1;
        list.clear();
        for (int i = j; i >= 0 ; i--) {
            for (Map.Entry<Byte, Integer> entry : hm.entrySet()){
                Integer value = entry.getValue();
                if (i == value){
                    list.add(entry.getKey());
                }
            }
            if(!list.isEmpty()){
                break;
            }
        }

        for (Byte i : list){
            System.out.print(i + " ");
        }
    }
}
