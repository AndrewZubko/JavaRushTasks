package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String name = bufferedReader.readLine();
            FileInputStream inputStream = new FileInputStream(name);
            if (inputStream.available() < 1000){
                inputStream.close();
                bufferedReader.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
