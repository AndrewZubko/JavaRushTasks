package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> own = new ArrayList<Integer>();
        ArrayList<Integer> thisrd = new ArrayList<Integer>();
        ArrayList<Integer> second = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            own.add(in.nextInt());
        } //create ownList

        for (int i = 0; i < own.size(); i++) {
            if (own.get(i) % 3 == 0){
                thisrd.add(own.get(i));
            }
            if (own.get(i) % 2 == 0){
                second.add(own.get(i));
            }
            if (own.get(i) % 3 != 0 && own.get(i) % 2 != 0){
                other.add(own.get(i));
            }
        }
        printList(thisrd);
        printList(second);
        printList(other);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
