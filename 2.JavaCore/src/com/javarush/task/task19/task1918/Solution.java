package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> arrayList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
       String tag = args[0];
        //String tag = "span";
        String startTag = "<" + tag;
        String stopTag = "</" + tag + ">";

        List<Integer> arrayIndexStartTeg = new ArrayList<>();
        List<Integer> arrayIndexStopTeg = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        BufferedReader reader = new BufferedReader(fileReader);
        String tmp = reader.readLine();
        String line = "";
        while(tmp != null){
            line += tmp;
            tmp = reader.readLine();
        }
        arrayIndexStartTeg = buildIndexTeg(line, startTag);
        arrayIndexStopTeg = buildIndexTeg(line, stopTag);

        Integer tmpStart = 0;
        Integer tmpStop = 0;
        while (arrayIndexStartTeg.size() != 0 && arrayIndexStopTeg.size() != 0) {
            tmpStart = arrayIndexStartTeg.get(arrayIndexStartTeg.size() - 1);
            tmpStop = arrayIndexStopTeg.get(arrayIndexStartTeg.size() - 1);
            int count = arrayIndexStartTeg.size() - 1;
            while (count != -1 && tmpStart < arrayIndexStopTeg.get(count)) {
                tmpStop = arrayIndexStopTeg.get(count);
                --count;
            }
            ++count;
            tmpStop = arrayIndexStopTeg.get(count);
            arrayList.add(line.substring(tmpStart, tmpStop + stopTag.length()));
            arrayIndexStartTeg.remove(tmpStart);
            arrayIndexStopTeg.remove(tmpStop);
        }
//        sort(arrayList);
        print(arrayList);
        bufferedReader.close();
        fileReader.close();
        reader.close();
    }

    public static ArrayList buildIndexTeg(String line, String teg){
        ArrayList <Integer> arrayInpexTeg = new ArrayList<>();
        Integer tmp = line.indexOf(teg);
        if (tmp != -1)
            arrayInpexTeg.add(tmp);
        while (tmp != -1){
            tmp = line.substring(arrayInpexTeg.get(arrayInpexTeg.size() - 1) + teg.length()).indexOf(teg);
            if (tmp != -1)
                arrayInpexTeg.add(arrayInpexTeg.get(arrayInpexTeg.size() - 1) + teg.length() + tmp);
        }
        return arrayInpexTeg;
    }

    public static void print(List<String> list){
        for (int i = list.size() - 1; i >= 0; --i){
            System.out.println(list.get(i));
        }
    }
}
