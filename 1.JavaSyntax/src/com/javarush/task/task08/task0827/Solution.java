package com.javarush.task.task08.task0827;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.DataFormatException;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat formatForDate1 = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        Date date1 = formatForDate1.parse(date);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date1);
//        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;
    }
}
