package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> employList = new HashMap<>();
        // BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\andre\\Desktop\\test.txt"));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine().trim();
            String name = line.substring(0, line.indexOf(" "));
            String salary = line.substring(line.indexOf(" ") + 1, line.length());
            Double dSalary = Double.valueOf(salary);
            if (employList.containsKey(name)) {
                Double prevSal = employList.get(name);//TODO:1
                employList.put(name, prevSal + dSalary);
            } else {
                employList.put(name, dSalary);
            }
//            System.out.println(name + " " + salary + " " + dSalary);
        }
        bufferedReader.close();
//        System.out.println("___________________________");
        List<String> employeeByKey = new ArrayList<>(employList.keySet());//TODO:2
        Collections.sort(employeeByKey);
        for (String name : employeeByKey) {
            System.out.println(name + " " + employList.get(name)); //TODO:1

        }
    }
}
