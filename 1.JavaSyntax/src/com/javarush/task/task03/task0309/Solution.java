package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int b = 1;
        for (int i = 1; i < 6; i++){
            if (i==1)
                System.out.println(i);
            else{
                b += i;
                System.out.println(b);
            }

        }

    }
}
