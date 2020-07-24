package com.javarush.task.task07.task0723;

/* 
Обратный отсчёт
*/

import java.io.IOException;
import java.util.Random;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }

        System.out.println("Бум!");
    }
}
