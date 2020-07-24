package com.javarush.task.task08.task0816;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<String, Date>();
        map.put("Denis", dateFormat.parse("MAR 15 2013"));
        map.put("Vadim", dateFormat.parse("JAN 11 2010"));
        map.put("Andrey", dateFormat.parse("JULY 7 2018"));
        map.put("Yehor", dateFormat.parse("FEB 21 2012"));
        map.put("Artem", dateFormat.parse("JUNE 1 2017"));
        map.put("Olga", dateFormat.parse("SEP 29 2015"));
        map.put("Tatiana", dateFormat.parse("MAY 1 2012"));
        map.put("Sveta", dateFormat.parse("AUG 4 2011"));
        map.put("Stas", dateFormat.parse("JUNE 16 2016"));
        map.put("Sergay", dateFormat.parse("DEC 28 2014"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterat = map.entrySet().iterator();

        while (iterat.hasNext()){
            Map.Entry<String, Date> pair = iterat.next();
            Date value = pair.getValue();
            if (value.getMonth() >=5 && value.getMonth() <= 7)
                iterat.remove();
        }

    }

    public static void main(String[] args) throws ParseException {
       /* Map<String, Date> ddd = createMap();
        System.out.println(ddd);
        removeAllSummerPeople(ddd);
        System.out.println("");
        System.out.println(ddd);*/
    }

}
