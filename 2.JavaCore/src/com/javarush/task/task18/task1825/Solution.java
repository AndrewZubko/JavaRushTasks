package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> nameList = new ArrayList<>();
        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String fileName = nameReader.readLine();
            if (fileName.equals("end")) break;
            nameList.add(fileName);
        }
        nameReader.close();

        Collections.sort(nameList);
        String name1 = nameList.get(0);
        int index = name1.indexOf(".");
        int index1 = name1.indexOf(".", index + 1);
        String firstName = name1.substring(0, index1);
        new File(firstName);
        for (String name : nameList){
            writeFile(name, firstName);
        }
       /* ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> nameList1 = new ArrayList<>();
        int index, index1, size;
        String fileName, name1, firstName;
        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            fileName = nameReader.readLine();
            if (fileName.equals("end")) break;
            nameList.add(fileName);
        }
        Collections.sort(nameList);
        boolean work = true;
        while (work) {
            if (nameList.isEmpty()) {
                work = false;
            } else {
                name1 = nameList.get(0);
                index = name1.indexOf(".");
                index1 = name1.indexOf(".", index + 1);
                firstName = name1.substring(0, index1);
                new File(firstName);

                size = nameList.size();
                for (int j = 1; j < size; j++) {
                    for (String name : nameList) {
                        String partName = "part" + j;
                        if (name.contains(firstName)) {
                            if (name.contains(partName)) {
                                writeFile(name, firstName);
                                nameList1.add(nameList.get(j));
                            }
                        }
                    }
                }
                for (String s : nameList1) {
                    nameList.remove(s);
                    nameList.clear();


                }

            }
        }*/
    }

        public static void writeFile (String partName, String fileName){
            try {
                FileInputStream fileReader = new FileInputStream(partName);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileReader);
                FileOutputStream fileWriter = new FileOutputStream(fileName, true);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileWriter);
                int i;
                while((i = bufferedInputStream.read()) != -1){
                    bufferedOutputStream.write(i);
                }
                bufferedInputStream.close();
                fileReader.close();
                bufferedOutputStream.close();
                fileWriter.close();
            } catch (IOException f) {
                f.printStackTrace();
            }
        }
}




