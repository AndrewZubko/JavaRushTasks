package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> employList = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        //BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\andre\\Desktop\\test1.txt"));

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine().trim();
            String name = line.substring(0, line.indexOf(" "));
            String salary = line.substring(line.indexOf(" ") + 1, line.length());
            Double dSalary = Double.valueOf(salary);
            if (employList.containsKey(name)) {
                Double prevSal = employList.get(name);
                employList.put(name, prevSal + dSalary);
            } else {
                employList.put(name, dSalary);
            }
        }
        bufferedReader.close();

        List<String> listKeys = new ArrayList<>();

        double minValue = 0;
        String name = "";
        for (Map.Entry<String, Double> entry : employList.entrySet()) {
            if (entry.getValue() > minValue){
                listKeys.clear();
                listKeys.add(entry.getKey());
                minValue = entry.getValue();
            }
            else if (entry.getValue() == minValue){
                listKeys.add(entry.getKey());
            }
        }

        for (String s : listKeys){
            System.out.println(s);
        }
    }
}
