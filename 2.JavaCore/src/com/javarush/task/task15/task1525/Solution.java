package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            Scanner sc = new Scanner(new File(Statics.FILE_NAME));
            while(sc.hasNext()){
                String tempMonth = sc.nextLine();
                lines.add(tempMonth);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
