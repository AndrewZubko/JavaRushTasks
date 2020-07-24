package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fileReader = new FileInputStream("C:\\Users\\andre\\Desktop\\" + fileName + ".txt");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(fileReader));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            String s = buffer.readLine();
            if (s != null) {
                int num = Integer.parseInt(s);
                if (num % 2 == 0){
                    list.add(num);
                }
            }
            else break;
        }
        reader.close();
        buffer.close();
        fileReader.close();

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
