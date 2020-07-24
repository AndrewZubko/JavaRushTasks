package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));

        while (fileReader.ready()){
            String line = fileReader.readLine();
            String[] lineBuf = line.split(" ");
            for (String s : lineBuf){
                if (s.contains("0") | s.contains("1") | s.contains("2") | s.contains("3") | s.contains("4")
                        | s.contains("5") | s.contains("6") | s.contains("7") | s.contains("8") | s.contains("9")){
                    fileWriter.write(s + " ");
                }
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
