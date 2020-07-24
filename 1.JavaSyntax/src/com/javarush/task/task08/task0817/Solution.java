package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Zubko", "Andrey");
        map.put("Lukianshuk", "Andrey");
        map.put("Rosha", "Yehor");
        map.put("Kuleshova", "Julia");
        map.put("Nesterenko", "Andrey");
        map.put("Grizhuk", "Rostislav");
        map.put("Levkin", "Maksim");
        map.put("Rolli", "Andrey");
        map.put("Kasianov", "Kolia");
        map.put("Mushtaeva", "Julia");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        /*Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();

        while (iter.hasNext()){
            Map.Entry<String, String> pair = iter.next();
            String value = pair.getValue();

        }*/
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, String> pair : map.entrySet()){
            if(Collections.frequency(map.values(), pair.getValue()) > 1){
                list.add(pair.getValue());
            }
        }

        for (String name : list) {
            removeItemFromMapByValue(map, name);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        Map<String, String> map = createMap();
//        System.out.println(map);
//        removeTheFirstNameDuplicates(map);
//        System.out.println(map);

    }
}
