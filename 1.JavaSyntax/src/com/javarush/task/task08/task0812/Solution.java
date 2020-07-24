package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }
        int count = 1;
        Integer[] array = new Integer[10];
        array[0] = 0;
        int a = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (a == list.get(i)){
                a = list.get(i);
                count++;
                array[i] = count;
            }
            else {
                array[i] = count;
                count = 1;
                a = list.get(i);
            }
        }
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(array[0]);

    }
}