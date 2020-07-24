package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {

    public static void isDouble(String string){
        boolean dBool;
        double d = 0.0;
        try{
            d = Double.parseDouble(string);
            dBool = true;
        }
        catch (Exception e){
            dBool = false;
        }
        if (dBool){
            print(d);
        }
        else{
            print(string);
        }

    }

    public static void isInteger(String string){
        boolean iBool;
        int i = 0;
        try{
            i = Integer.parseInt(string);
            iBool = true;
        }
        catch (Exception e){
            iBool = false;
        }
        if (iBool){
            if (i > 0 && i < 128){
                print((short) i);
            }
            else {
                print(i);
            }
        }
        else {
            print(string);
        }
    }


    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        while (true) {
            String s = reader.nextLine();
            if (s.equals("exit")){
                break;
            }
            if (s.isEmpty()){
                print(s);
            }
            int index = s.indexOf(".");
            int index1 = s.indexOf(",");
            if (index >= 0 || index1 >= 0){
                isDouble(s);
            }
            else{
                isInteger(s);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
