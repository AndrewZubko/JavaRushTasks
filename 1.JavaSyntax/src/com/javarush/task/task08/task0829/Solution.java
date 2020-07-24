package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Handler;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       /* List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        // Read the house number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }*/

        Map<String, String> family = new HashMap<String, String>();

        while (true) {
            String city = reader.readLine();
            if (city.isEmpty())
                break;
            String LName = reader.readLine();
            if (LName.isEmpty())
                break;
            family.put(city, LName);
        }
        if (family.size() >= 1){
            String RCity = reader.readLine();
            System.out.println(family.get(RCity));

        }
    }
}
