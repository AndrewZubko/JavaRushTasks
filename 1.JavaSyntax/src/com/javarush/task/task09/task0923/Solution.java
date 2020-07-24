package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String ss = s.replaceAll(" ", "");
        char[] strToArray = ss.toCharArray();

        ArrayList<Character> glasn = new ArrayList<>();
        ArrayList<Character> soglasn = new ArrayList<>();
        for (int i = 0; i < strToArray.length; i++) {
            if (isVowel(strToArray[i])){
               glasn.add(strToArray[i]);
            }
            else
                soglasn.add(strToArray[i]);
        }
        for (Character gl: glasn){
            System.out.print(gl + " ");
        }
        System.out.println();
        for (Character cog: soglasn){
            System.out.print(cog + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}