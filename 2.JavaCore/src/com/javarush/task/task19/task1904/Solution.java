package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/

import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner1) {
            fileScanner = fileScanner1;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String personLine = fileScanner.nextLine();
            ArrayList<String> subLine = new ArrayList<>();
            Collections.addAll(subLine, personLine.split(" "));
            String bd = subLine.get(3) + " " + subLine.get(4) + " " + subLine.get(5);
            Date BD = new SimpleDateFormat("dd MM yyyy").parse(bd);
            return new Person(subLine.get(1), subLine.get(2), subLine.get(0), BD);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
