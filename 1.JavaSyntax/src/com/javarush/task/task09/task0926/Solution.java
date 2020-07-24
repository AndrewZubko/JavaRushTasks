package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] first = new int[]{0, 1, 2, 3, 4}; list.add(first);
        int[] second = new int[]{5, 6}; list.add(second);
        int[] third = new int[]{7, 8, 9, 10}; list.add(third);
        int[] forth = new int[]{11, 12, 13, 14, 15, 16, 17}; list.add(forth);
        int[] fifth = new int[0];list.add(fifth);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
