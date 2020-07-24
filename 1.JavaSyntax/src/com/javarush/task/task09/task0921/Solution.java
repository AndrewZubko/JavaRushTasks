package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner in = new Scanner(System.in);
        try{
            while (true){
                list.add(in.nextInt());
            }

        }
        catch (Exception e){
            for (Integer i: list){
                System.out.println(i);
            }
        }
    }
}
