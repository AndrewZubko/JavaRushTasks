package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        Scanner reader = new Scanner(System.in);
        String obj = reader.nextLine();
        if (obj.equals("helicopter")){
            result = new Helicopter();
        }
        else if (obj.equals("plane")){
            int pass = reader.nextInt();
            result = new Plane(pass);
        }
        reader.close();
    }

}
