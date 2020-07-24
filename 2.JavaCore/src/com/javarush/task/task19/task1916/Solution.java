package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();
/*    public static ArrayList<String> fileList1 = new ArrayList<>();
    public static ArrayList<String> fileList2 = new ArrayList<>();*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr1 = new BufferedReader(new FileReader(br.readLine()));
        BufferedReader fr2 = new BufferedReader(new FileReader(br.readLine()));
        br.close();
        while (fr2.ready()){
            if (!fr1.ready()){
                lines.add(new LineItem(Type.ADDED, fr2.readLine()));
                continue;
            }
            fr1.mark(10000);
            String string101 = fr1.readLine();
            fr2.mark(10000);
            String string201 = fr2.readLine();
            String string202 = fr2.readLine();
            if (string101.equals(string201)) {
                lines.add(new LineItem(Type.SAME, string101));
                fr2.reset();
                fr2.readLine();
            }
            else if (string101.equals(string202)) {
                lines.add(new LineItem(Type.ADDED, string201));
                fr1.reset();
                fr2.reset();
                fr2.readLine();
            }
            else {
                lines.add(new LineItem(Type.REMOVED, string101));
                fr2.reset();
            }
        }
        while (fr1.ready()){
            lines.add(new LineItem(Type.REMOVED, fr1.readLine()));
        }
        fr1.close();
        fr2.close();
        /*BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader fileReader1 = new BufferedReader(new FileReader(nameReader.readLine()));
//        BufferedReader fileReader2 = new BufferedReader(new FileReader(nameReader.readLine()));
        BufferedReader fileReader1 = new BufferedReader(new FileReader("C:\\Users\\andre\\Desktop\\test1.txt"));
        BufferedReader fileReader2 = new BufferedReader(new FileReader("C:\\Users\\andre\\Desktop\\test2.txt"));
        nameReader.close();

        while(fileReader1.ready()){
            fileList1.add(fileReader1.readLine());
        }

        while(fileReader2.ready()){
            fileList2.add(fileReader2.readLine());
        }

        fileReader1.close();
        fileReader2.close();

        int i = 0;
        if (fileList1.size() > fileList2.size()) {
            compareLine(fileList2.size());
            for (int j = fileList2.size(); j < fileList1.size(); j++) {
                lines.add(new LineItem(Type.REMOVED, fileList1.get(j)));
            }
        }
        else if(fileList1.size() < fileList2.size()) {
            compareLine(fileList1.size());
            for (int j = fileList1.size(); j < fileList2.size(); j++) {
                lines.add(new LineItem(Type.ADDED, fileList2.get(j)));
            }
        }
        else compareLine(fileList1.size());

        for (LineItem li : lines){
            System.out.println(li.type + " " + li.line);
        }*/
    }

   /* public static void compareLine(int i){
        for (int j = 0; j < i ; j++) {
            if (fileList1.get(j).equals(fileList2.get(j)))
                lines.add(new LineItem(Type.SAME, fileList2.get(j)));
            else if (fileList2.get(j).equals(""))
                lines.add(new LineItem(Type.REMOVED, fileList1.get(j)));
            else if (fileList1.get(j).equals(""))
                lines.add(new LineItem(Type.ADDED, fileList2.get(j)));


        }
    }*/

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
