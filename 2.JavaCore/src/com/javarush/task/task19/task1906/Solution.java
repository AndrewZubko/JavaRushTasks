package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = nameReader.readLine();
        String secondFile = nameReader.readLine();
        nameReader.close();

        FileReader fileReader = new FileReader(firstFile);
        FileWriter fileWriter = new FileWriter(secondFile);
        int i = 1;
        while(fileReader.ready()){
            int data = fileReader.read();
            if ((i % 2) == 0){
                fileWriter.write(data);
            }
            i++;
        }
        fileReader.close();
        fileWriter.close();
    }
}
