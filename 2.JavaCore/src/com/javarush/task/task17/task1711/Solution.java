package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    public static SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static SimpleDateFormat date1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {

        switch (args[0]){
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        try {
                            System.out.println(addPerson(args[i], args[i + 1], date.parse(args[i + 2])));
                        } catch (ParseException e) {
                        }
                    }
                }
                break;

            case "-u":
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i += 4) {
                        try {
                            updatePerson(Integer.parseInt(args[i]), args[i+1], args[i+2], date.parse(args[i+3]));
                        }
                        catch (ParseException e){
                        }
                    }
                }
                break;

            case "-d":
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i++) {
                        deletePerson(Integer.parseInt(args[i]));
                    }
                }
                break;

            case "-i":{
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i++) {
                        System.out.println(informationPerson(Integer.parseInt(args[i])));
                    }
                }
            }
        }
    }

    private static Integer addPerson (String name, String sex, Date bd){
        if (sex.equals("м"))
            allPeople.add(Person.createMale(name, bd));
        else allPeople.add(Person.createFemale(name, bd));
        return allPeople.size() - 1;

    }

    private static void updatePerson (int index ,String name, String sex, Date bd){
        allPeople.get(index).setName(name);
        allPeople.get(index).setBirthDate(bd);
        if (sex.equals("м"))
            allPeople.get(index).setSex(Sex.MALE);
        else allPeople.get(index).setSex(Sex.FEMALE);
    }

    private static void deletePerson (int index){
        allPeople.get(index).setName(null);
        allPeople.get(index).setSex(null);
        allPeople.get(index).setBirthDate(null);
    }

    private static String informationPerson (int index){
            return allPeople.get(index).getName() + " " + (allPeople.get(index).getSex().equals(Sex.MALE) ? "м" : "ж") +
                    " " + date1.format(allPeople.get(index).getBirthDate());
    }
}
