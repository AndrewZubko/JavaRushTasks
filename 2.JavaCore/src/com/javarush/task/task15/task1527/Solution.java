package com.javarush.task.task15.task1527;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s = reader.nextLine();
        reader.close();
        int question = s.indexOf("?");
        ArrayList<Integer> listIndexAND = findIndex(s, "&");
        ArrayList<Integer> listIndexEVEN = findIndex(s, "=");
        ArrayList<String> listObjArgumen = new ArrayList<String>();
        listIndexAND.add(0, question);

        while (true){
            if (listIndexAND.size() == 2 && listIndexAND.get(1) == -1){      //вариант когда нету знака & и только 1 параметр
                listIndexAND.remove(1);
                if (listIndexEVEN.size() == 1 && (listIndexAND.get(0) < listIndexEVEN.get(0))){
                    String obj = cutString(listIndexAND.get(0), s, listIndexEVEN.get(0));
                    if (obj.equals("obj")){
                        listObjArgumen.add(cutString(listIndexEVEN.get(0), s, s.length()));
                    }
                    System.out.println(obj);
                    break;
                }
                else {
                    System.out.print(cutString(listIndexAND.get(0), s, s.length()));
                    break;
                }
            }
            else if (listIndexAND.size() > 1){                     //когда ЕНДов бельше 1го
                if (listIndexEVEN.size() > 0 && !listIndexEVEN.contains(-1)){
                    if (listIndexAND.get(0) < listIndexEVEN.get(0) && listIndexEVEN.get(0) < listIndexAND.get(1)){ //если знак = между двумя ЕНД
                        String obj = cutString(listIndexAND.get(0), s, listIndexEVEN.get(0));
                        if (obj.equals("obj")){
                            listObjArgumen.add(cutString(listIndexEVEN.get(0), s, listIndexAND.get(1)));
                        }
                        System.out.print(obj + " ");
                        listIndexAND.remove(0);
                        listIndexEVEN.remove(0);
                    }
                    else if (listIndexAND.get(0) < listIndexEVEN.get(0) && listIndexEVEN.get(0) > listIndexAND.get(1)){  //если нету знака = между ЕНДами
                        System.out.print((cutString(listIndexAND.get(0), s, listIndexAND.get(1))) + " ");
                        listIndexAND.remove(0);
                    }

                }
                else{
                    System.out.print((cutString(listIndexAND.get(0), s, listIndexAND.get(1))) + " ");
                    listIndexAND.remove(0);
                }
            }
            else if (listIndexAND.size() == 1){
                if (listIndexEVEN.size() == 1 && (listIndexAND.get(0) < listIndexEVEN.get(0))){
                    String obj = cutString(listIndexAND.get(0), s, listIndexEVEN.get(0));
                    if (obj.equals("obj")){
                        listObjArgumen.add(cutString(listIndexEVEN.get(0), s, s.length()));
                    }
                    System.out.println(obj);
                    listIndexAND.remove(0);
                    listIndexEVEN.remove(0);
                    break;
                }
                else {
                    System.out.println(cutString(listIndexAND.get(0), s, s.length()));
                    break;
                }
            }

        }

        if (listObjArgumen.size() > 0){
            for (String ss: listObjArgumen){
//                int index = ss.indexOf(".");
//                if (index >= 0) {
                    try {
                        double d = Double.parseDouble(ss);
                        alert(d);
                    }
                    catch (Exception e){
                        alert(ss);
                    }

            }
        }
    }

    public static String cutString(int start, String string, int finish){
        char[] stringChar = string.toCharArray();
        String s = "";
        for (int i = start+1; i < finish ; i++) {
            s = s + stringChar[i];
        }
        return s;
    }

    public static ArrayList<Integer> findIndex(String string, String find){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int indexNumber = string.indexOf(find);
        list.add(indexNumber);
        int i = 0;
        while (true){
            indexNumber = string.indexOf(find, list.get(i) + 1);
            if (indexNumber > 0){
                list.add(indexNumber);
                i++;
            }
            else{
                break;
            }
        }
        return list;
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
