package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> list = new HashMap<String, Integer>();
        for (int i = 0; i < 10; i++) {
            list.put("MMM" + i, 100 * i);
        }
        return list;
    }

    public static Map<String, Integer> removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> mm = iterator.next();
            String key = mm.getKey();
            Integer value = mm.getValue();
            if (value < 500) {
                iterator.remove();
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(removeItemFromMap(createMap()));
    }
}