package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        //BufferedReader fileReader = new BufferedReader(new FileReader("C:\\Users\\andre\\Desktop\\test1.txt"));

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        while(fileReader.ready()){
            String line = fileReader.readLine();
            String[] words = line.split(" ");
            int year = Integer.parseInt(words[words.length - 1]);
            int mon = Integer.parseInt(words[words.length - 2]);
            int day = Integer.parseInt(words[words.length - 3]);
            String name = "";
            for (int i = 0; i < words.length - 3; i++) {
                name += words[i] + " ";
            }
            Date bd = dateFormat.parse("" + day  + " "+ mon + " "+ year);
            PEOPLE.add(new Person(name.trim(), bd));
        }
        fileReader.close();

    }
}
