package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));

        ArrayList<String> wordList = new ArrayList<>();
        while(fileReader.ready()){
            String line = fileReader.readLine();
            for (String s : line.split(" ")){
                if (s.length() > 6){
                    wordList.add(s);
                }
            }
        }
        for (int i = 0; i < wordList.size() - 1; i++) {
            fileWriter.write(wordList.get(i) + ",");
        }
        fileWriter.write(wordList.get(wordList.size() - 1));
        fileReader.close();
        fileWriter.close();


    }
}
