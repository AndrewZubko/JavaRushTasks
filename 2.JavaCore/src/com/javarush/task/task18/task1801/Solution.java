package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        /*Scanner readName = new Scanner(System.in);
        String fileName = readName.nextLine();
        readName.close();
        FileInputStream readFile = new FileInputStream(fileName);
        List<Byte> fileList = new ArrayList<>();
        while (readFile.available() > 0){
            int data = readFile.read();
            fileList.add((byte)data);
        }
        readFile.close();
        Collections.sort(fileList);
        System.out.println(fileList.get(fileList.size()));*/
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(fileName);
        int maxByte = Integer.MIN_VALUE;
        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            if (data > maxByte){
                maxByte = data;
            }
        }
        inputStream.close();
        if(maxByte == Integer.MIN_VALUE)
            maxByte = 0;
        System.out.println((byte)maxByte);
    }
}
