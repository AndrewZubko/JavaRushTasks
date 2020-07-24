package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put(2., "vf");
        labels.put(2.1, "vd");
        labels.put(2.2, "sv");
        labels.put(2.3, "tv");
        labels.put(2.4, "qv");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
