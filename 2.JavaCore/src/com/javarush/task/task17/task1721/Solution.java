package com.javarush.task.task17.task1721;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException{
        Scanner reader = new Scanner(System.in);
        String firstName = reader.nextLine();
        String secondName = reader.nextLine();
        reader.close();
        readFile(firstName, allLines);
        readFile(secondName, forRemoveLines);
        Solution sol = new Solution();
        sol.joinData();


    }
    public static void readFile(String s, List<String> g){
        try{
            Scanner in = new Scanner(new File(s));
            while(in.hasNextLine()){
                g.add(in.nextLine());
            }
            in.close();
        }
        catch (FileNotFoundException e){
        }
    }
    public void joinData() throws CorruptedDataException {
       /* int i = 0;
        for(String line: forRemoveLines){
            for (String line1: allLines){
                if (line.equals(line1)){
                    i++;
                }
            }
        }

        if (i == forRemoveLines.size()){
            for(String line: forRemoveLines){
                for (String line1: allLines){
                    if (line.equals(line1)){
                        allLines.remove(line1);
                    }
                }
            }
        }
        else{
            allLines.clear();
            throw new CorruptedDataException();
        }*/
        int count=0;
        for (int i=0;i<forRemoveLines.size();i++){
            for (int j=0;j<allLines.size();j++){
                if (forRemoveLines.get(i).equals(allLines.get(j))){
                    count++;

                }
            }
        }
        if (count==forRemoveLines.size()){
            for (int i=0;i<forRemoveLines.size();i++)
                for (int j=0;j<allLines.size();j++)
                    if (forRemoveLines.get(i).equals(allLines.get(j))){
                        allLines.remove(j);
                        j--;
                    }
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
