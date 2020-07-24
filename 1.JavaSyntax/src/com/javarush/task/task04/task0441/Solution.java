package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        if (a != b && b != c && a != c){
            if((a < b && b < c) || (c < b && b < a))
                System.out.print(b);
            else if((b < a && a < c) || (c < a && a < b))
                System.out.print(a);
            else if((b < c && c < a) || (a < c && c < b))
                System.out.print(c);

        }
        else {
            if (a == b && a != c && b != c)
                System.out.print(a);
            else if (b == c && b != a && a != c)
                System.out.print(b);
            else if (a == c && a != b && b != c)
                System.out.print(a);
            else
                System.out.print(a);
        }

    }
}
