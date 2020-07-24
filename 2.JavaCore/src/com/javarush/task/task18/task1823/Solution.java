package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static  Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        while (!(fileName.equals("exit"))){
            ReadThread thread = new ReadThread(fileName);
            thread.start();
            fileName = reader.readLine();
        }
        reader.close();
    }

    public static class ReadThread extends Thread{
        String fileName;
        public ReadThread(String fileName) throws FileNotFoundException, IOException {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                ArrayList<Integer> list = new ArrayList<>();
                Map<Integer,Integer> map = new HashMap<>();
                FileInputStream reader = new FileInputStream(fileName);
                while (reader.available() > 0) {
                    list.add(reader.read());
                }
                map = new HashMap<>();
                for (Integer b : list){
                    if (map.containsKey(b)){
                        int i = map.get(b) + 1;
                        map.put(b, i);
                    }
                    else{
                        map.put(b, 1);
                    }
                }
                int b = 0;
                int max = 0;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                    if (entry.getValue() > max){
                        max = entry.getValue();
                        b = entry.getKey();
                    }
                }
                resultMap.put(fileName, b);
                System.out.println(resultMap);
                reader.close();
            }
            catch (IOException e){}
        }


    }
}
