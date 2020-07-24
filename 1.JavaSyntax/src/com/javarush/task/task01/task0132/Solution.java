package com.javarush.task.task01.task0132;
import java.util.Arrays;
/* 
Сумма цифр трехзначного числа
*/

import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {

        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++){
            arr[i] = number % 10;
            number /= 10;
        }
        int total = IntStream.of(arr).sum();
        return  total;
    }
}