package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileWriter write = new FileWriter(fileName + ".txt");
        BufferedWriter fileWriter = new BufferedWriter(write);
        if (!fileName.isEmpty()){
            while (true){
                String line = reader.readLine();
                if (line.equals("exit")){
                    fileWriter.write(line);
                    break;
                }
                fileWriter.write(line);
                fileWriter.write("\n");
            }

        }
        reader.close();
        fileWriter.close();
        write.close();


    }
}
