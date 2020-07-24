package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int bb = 10;
        int ii;
        for (ii = 9; ii > 1; ii--){
           bb = bb * ii;
           if (bb > 3000000)
               System.out.print(bb);

        }
        }

    }

