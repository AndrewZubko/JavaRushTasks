package com.javarush.task.task17.task1710;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        try {
            if (args[0].equals("-c")) {
                String name = args[1];
                String sex = args[2];
                try {
                    Date bd = dataFormat.parse(args[3]);
                    if (sex.equals("м")) {
                        allPeople.add(Person.createMale(name, bd));
                    } else if (sex.equals("ж")) {
                        allPeople.add(Person.createFemale(name, bd));
                    }
                } catch (ParseException e) {
                }
                System.out.println(allPeople.size() - 1);
            } else if (args[0].equals("-u")) {
                int index = Integer.parseInt(args[1]);
                String name = args[2];
                allPeople.get(index).setName(name);
                String sex = args[3];
                try {
                    Date bd = dataFormat.parse(args[4]);
                    allPeople.get(index).setBirthDate(bd);
                    if (sex.equals("м")) {
                        allPeople.get(index).setSex(Sex.MALE);
                    } else if (sex.equals("ж")) {
                        allPeople.get(index).setSex(Sex.FEMALE);
                    }
                } catch (ParseException e) {
                }
            } else if (args[0].equals("-d")) {
                int index = Integer.parseInt(args[1]);
                allPeople.get(index).setName(null);
                allPeople.get(index).setBirthDate(null);
                allPeople.get(index).setSex(null);
            } else if (args[0].equals("-i")) {
                SimpleDateFormat formatI = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                int index = Integer.parseInt(args[1]);
                String out = allPeople.get(index).getName();

                if (allPeople.get(index).getSex().equals(Sex.MALE)) {
                    out += " м ";
                } else {
                    out += " ж ";
                }
                Date date = allPeople.get(index).getBirthDate();
                String result = formatI.format(date);
                out += result;
                System.out.println(out);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){}
    }
}
