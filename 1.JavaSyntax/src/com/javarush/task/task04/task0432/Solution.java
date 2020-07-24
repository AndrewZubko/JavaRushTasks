package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int num = in.nextInt();
        in.close();
        int i = 1;
        while(i <= num){
            System.out.println(s);
            i++;
        }

    }
}
