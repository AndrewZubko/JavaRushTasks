package com.javarush.task.task19.task1905;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }
    public static void main(String[] args) {
        String phoneNumber = "+3(805)0123-4567";
        String result = "";
        char[] array = phoneNumber.toCharArray();
        for (Character c : array){
            if ((c != '(') && (c != ')') && (c != '-')){
                result += c;
            }
        }
        System.out.println(result);
    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer1, Contact contact1) {
            customer = customer1;
            contact = contact1;
        }
        @Override
        public String getCountryCode() {
            String countryName = customer.getCountryName();
            for (Map.Entry<String, String> line : countries.entrySet()){
                if (line.getValue().equals(countryName)){
                    return line.getKey();
                }
            }
            return countryName;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String s = contact.getName();
            ArrayList<String> list = new ArrayList<>();
            Collections.addAll(list, s.split(", "));
            return list.get(1);
        }

        @Override
        public String getContactLastName() {
            String s = contact.getName();
            ArrayList<String> list = new ArrayList<>();
            Collections.addAll(list, s.split(", "));
            return list.get(0);
        }

        @Override
        public String getDialString() {
            String phoneNumber = contact.getPhoneNumber();
            String result = "";
            char[] array = phoneNumber.toCharArray();
            for (Character c : array){
                if ((c != '(') && (c != ')') && (c != '-')){
                    result += c;
                }
            }
            return "callto://" + result;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}