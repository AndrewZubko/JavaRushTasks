package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
       /* BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        ArrayList<Character> list = new ArrayList<>();
        int symvol = reader.read();
        while (symvol != -1){
            list.add((char) symvol);
            symvol = reader.read();
        }
        reader.close();
        int i = 0;
        for(char c : list){
            if (c == ' ')
                i++;

        }
        double dd = i/list.size() * 100;
        BigDecimal bigDecimal = new BigDecimal(dd);
        System.out.println(bigDecimal.setScale(2));*/
        FileInputStream fis = new FileInputStream(args[0]);
        double chars = 0.0, spaces = 0.0;
        while(fis.available() > 0){
            int data = fis.read();
            if(data == Integer.valueOf(' ')) spaces++;
            chars++;
        }
        fis.close();
        //DecimalFormat df = new DecimalFormat("#.##");
        //df.setRoundingMode(RoundingMode.HALF_UP);
        //System.out.println(df.format(spaces*100/chars));
        System.out.printf("%.2f", (spaces*100/chars));
    }
}
