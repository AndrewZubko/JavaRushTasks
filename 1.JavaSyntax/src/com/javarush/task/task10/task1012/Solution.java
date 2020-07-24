package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        //создание словаря
        Map<Character, Integer> letter = new HashMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            letter.put(alphabet.get(i), 0);
        }

        for (int i = 0; i < list.size(); i++) {            //ходит про массивам
            char[] arrayChars = list.get(i).toCharArray();
            for (int j = 0; j < arrayChars.length; j++) {  //ходит по чарам массива
                if(alphabet.contains(arrayChars[j])){      //проверка, соответствует ли алфавиту
                    int x = letter.get(arrayChars[j]);
                    x++;
                    letter.put(arrayChars[j], x);
                }

            }
        }
        for (int i = 0; i < alphabet.size(); i++) {
            int n = letter.get(alphabet.get(i));
            System.out.println(alphabet.get(i) + " " + n);
        }

//        for (Map.Entry<Character, Integer> pair: letter.entrySet()){
//            char key = pair.getKey();
//            int num = pair.getValue();
//            System.out.println(key + " " + num);
//        }
    }
}
