package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    static ArrayList<FileInputStream> list = new ArrayList<>();
    static boolean work = true;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(work){
            String name = reader.readLine();
            stream(name);
        }
        reader.close();
    }
    public static void stream (String fileName) throws IOException{
        try{
            list.add(new FileInputStream(fileName));
        }
        catch (FileNotFoundException e){
            System.out.println(fileName);
            for (FileInputStream str : list){
                str.close();
                work = false;
            }
        }

    }
}
