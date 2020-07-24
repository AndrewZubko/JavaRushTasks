package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    static ArrayList<String> words = new ArrayList<>();
    static ArrayList<Integer> numb = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : words) {
            System.out.println(x);
        }
        for (int i = numb.size(); i > 0; i--) {
            System.out.println(numb.get(i - 1));
        }
    }

    public static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])){
                numb.add(Integer.parseInt(array[i]));
            }
            else
                words.add(array[i]);
        }
        Collections.sort(numb);
        isGreaterThan(words.get(1), words.get(2));
        Collections.sort(words);

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {

        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
