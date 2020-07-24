package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> vegatebles = new HashSet<String>();
        vegatebles.add("арбуз");
        vegatebles.add("банан");
        vegatebles.add("вишня");
        vegatebles.add("груша");
        vegatebles.add("дыня");
        vegatebles.add("ежевика");
        vegatebles.add("женьшень");
        vegatebles.add("земляника");
        vegatebles.add("ирис");
        vegatebles.add("картофель");
        for (String st: vegatebles){
            System.out.println(st);
        }
    }
}
