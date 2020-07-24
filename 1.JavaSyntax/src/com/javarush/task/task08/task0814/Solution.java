package com.javarush.task.task08.task0814;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> list = new HashSet<Integer>();
        for (int i = 1; i < 21; i++) {
            list.add(i);
        }
        return list;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
      Set<Integer> list1 = new HashSet<>();
      for (Integer in: set){
          if (in > 10){
              list1.add(in);
          }
      }
        set.removeAll(list1);
        return set;
    }

    public static void main(String[] args) {
       //System.out.println(removeAllNumbersGreaterThan10(createSet()));
    }
}
