package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.FileInputStream;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner streamName = new Scanner(System.in);
//        String name = streamName.nextLine();
        FileInputStream inputStream = new FileInputStream(streamName.nextLine());
        streamName.close();
        List<Integer> fileList = new ArrayList<>();
        while (inputStream.available() > 0){
            int data = inputStream.read();
            fileList.add(data);
        }
        inputStream.close();
        Collections.sort(fileList);
        System.out.println(fileList.get(0));
    }
}
