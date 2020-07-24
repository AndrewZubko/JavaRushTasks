package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        String pp = "р", ll = "л";
        for (int i = 0; i < strings.size(); i++) {
            int p = strings.get(i).indexOf(pp), l = strings.get(i).indexOf(ll);
            if (p >= 0 && l == -1){
                strings.remove(i);
                i--;
            }

            else if (l >= 0 && p == -1){
                strings.add(i, strings.get(i));
                i++;
            }



        }
        return strings;
    }
}