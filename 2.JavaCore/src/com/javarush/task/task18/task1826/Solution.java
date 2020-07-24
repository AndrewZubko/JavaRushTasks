package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String name1 = "" + args[1];
        String name2 = "" + args[2];
        int i;
        if (args[0].equals("-e")){ //зашифровать/расшифровать данные
            i = 0;
            ED(i, name1, name2);
        }
        else if (args[0].equals("-d")){
            i = 1;
            ED(i, name1, name2);
        }
    }

    public static void ED (int i, String name1, String name2) throws FileNotFoundException, IOException {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        FileInputStream fileReader = new FileInputStream(name1);
        int j;
        while((j = fileReader.read()) != -1){
            list1.add(j);
        }
        int key = 1;
        if (i == 0){
            for (Integer o : list1){
                list2.add(o + key);
            }
        }
        else if (i == 1){
            for (Integer o : list1){
                list2.add(o - key);
            }
        }
        FileOutputStream fileWriter = new FileOutputStream(name2);
        for (Integer a : list2){
            fileWriter.write(a);
        }
        fileReader.close();
        fileWriter.close();
    }

}
