package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static{
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        //BufferedReader fileReader = new BufferedReader(new FileReader("C:\\Users\\andre\\Desktop\\test1.txt"));
        bufferedReader.close();
        while (fileReader.ready()){
            String line = fileReader.readLine();
            String[] lineBuf = line.split(" ");
            for (int i = 0; i < lineBuf.length; i++) {
                if (lineBuf[i].equals("0"))
                    lineBuf[i] = map.get(0);
                else if (lineBuf[i]. equals("1")){
                    lineBuf[i] = map.get(1);
                }
                else if (lineBuf[i]. equals("2")) {
                    lineBuf[i] = map.get(2);
                }
                else if (lineBuf[i]. equals("3")) {
                    lineBuf[i] = map.get(3);
                }
                else if (lineBuf[i]. equals("4")) {
                    lineBuf[i] = map.get(4);
                }
                else if (lineBuf[i]. equals("5")) {
                    lineBuf[i] = map.get(5);
                }
                else if (lineBuf[i]. equals("6")) {
                    lineBuf[i] = map.get(6);
                }
                else if (lineBuf[i]. equals("7")) {
                    lineBuf[i] = map.get(7);
                }
                else if (lineBuf[i]. equals("8")) {
                    lineBuf[i] = map.get(8);
                }
                else if (lineBuf[i]. equals("9")) {
                    lineBuf[i] = map.get(9);
                }
                else if (lineBuf[i]. equals("10")) {
                    lineBuf[i] = map.get(10);
                }
                else if (lineBuf[i]. equals("11")) {
                    lineBuf[i] = map.get(11);
                }
                else if (lineBuf[i]. equals("12")) {
                    lineBuf[i] = map.get(12);
                }
            }
            fileReader.close();
            for (String s : lineBuf){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
