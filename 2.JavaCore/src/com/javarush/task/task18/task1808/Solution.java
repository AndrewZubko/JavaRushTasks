package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        String name3 = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream inputStream = new FileInputStream(name1);
        FileOutputStream outputStream2 = new FileOutputStream(name2);
        FileOutputStream outputStream3 = new FileOutputStream(name3);
        byte[] buffer = new byte[inputStream.available()];
        if (inputStream.available() > 0){
            int count = inputStream.read(buffer);
            int lenght = buffer.length;
            if ((lenght % 2) == 0){
                for (int i = 0; i <= (lenght / 2) - 1; i++) {
                    outputStream2.write(buffer[i]);
                }
                for (int i = lenght / 2; i <= lenght - 1; i++) {
                    outputStream3.write(buffer[i]);
                }
            }
            else{
                int l = (lenght - 1) / 2;
                for (int i = 0; i <= l ; i++) {
                    outputStream2.write(buffer[i]);
                }
                for (int i = l + 1; i <= lenght - 1; i++) {
                    outputStream3.write(buffer[i]);
                }
            }
        }
        inputStream.close();
        outputStream2.close();
        outputStream3.close();
    }
}
