package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        boolean work = true;
        ArrayList<String> list = new ArrayList<>();
        String line = null;
        while(work) {
            line = fileReader.readLine();
            for (String v : line.split(" ")) {
                list.add(v);
            }
            if (list.get(0).equals(args[0])) {
                System.out.println(line);
                /*String quantity = list.get(list.size() - 1);
                String price = list.get(list.size() - 2);
                String name = null;
                for (int i = 1; i < list.size() - 2; i++) {
                    name += list.get(i) + " ";
                }
                System.out.print(list.get(0) + " " + name + price + " " + quantity);*/
                work = false;
            }
            list.clear();
        }
        fileReader.close();

    }
}
