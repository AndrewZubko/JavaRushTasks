package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name1 = reader.readLine();
    String name2 = reader.readLine();
        reader.close();

                BufferedReader fileReader = new BufferedReader(new FileReader(name1));
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter(name2));
                String line = fileReader.readLine();
                for (String v : line.split(" ")){
                fileWriter.write(rounding(v) + " ");
                }
                fileReader.close();
                fileWriter.close();
                }


               /* FileInputStream fileReader = new FileInputStream(name1);
                FileOutputStream fileWriter = new FileOutputStream(name2);
                int i;
                int num = 0;
                while ((i = fileReader.read()) != -1){
                byte[] buffer = new byte[8];
                double d;
                int res;
                char c = (char)i;
                if (c != ' '){
                buffer[num] = (byte)i;
                num++;
                }
                else{
                d = ByteBuffer.wrap(buffer).getDouble(0);
                res = rounding(d);
                num = 0;
                buffer = null;
                }
                }
                fileReader.close();
                fileWriter.close();
                }*/

public static Integer rounding(String s){
        double d = Double.parseDouble(s);
        int i = (int)Math.round(d);
        return i;
        }

}
