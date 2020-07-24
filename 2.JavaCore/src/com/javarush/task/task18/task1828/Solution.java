package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length != 0 && (args[0].equals("-u") || args[0].equals("-d"))){
            BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = nameReader.readLine();
            nameReader.close();

            ArrayList<String> fileList = new ArrayList<>();
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            while(fileReader.ready()){
                fileList.add(fileReader.readLine());
            }
            fileReader.close();

            String sID = args[1];

            String productName, price, quantity;
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));
            if (args[0].equals("-d")){
                for (String line : fileList){
                    if (line.contains(sID)){
                        fileList.remove(line);
                    }
                }
                for (String line : fileList){
                    fileWriter.write(line + "\n");
                }
            }
            else if (args[0].equals("-u")){
                int b = 0;
                for (int i = 0; i < fileList.size() - 1; i++) {
                    if (fileList.get(i).contains(String.format("%-8s", sID))){
                        b = i;
                        break;
                    }
                }

                String id = String.format("%-8s", sID);
                productName = String.format("%-30s", args[2]);
                price = String.format("%-8s", args[3]);
                quantity = String.format("%-4s", args[4]);
                fileList.set(b, (id + productName + price + quantity));
                for (String line : fileList){
                    fileWriter.write(line + "\n");
                }

            }
            fileWriter.close();

        }
        else return;

    }

}
