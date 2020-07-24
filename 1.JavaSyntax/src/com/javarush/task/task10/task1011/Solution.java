package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        System.out.println(s);
        char[] array = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();

        for (int i = array.length - 1; i >= 0; i--)  {
            list.add(0, array[i] );
        }

        for (int i = 0; i < 39; i++) {
            list.remove(0);
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j));
            }
            if (i == 38){}
            else
                System.out.println();
        }
        //напишите тут ваш код
    }

}

