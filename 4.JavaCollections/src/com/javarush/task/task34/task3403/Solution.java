package com.javarush.task.task34.task3403;

/* 
Разложение на множители с помощью рекурсии
*/
public class Solution {
    public void recurse(int n) {
        if (n <= 1) {
        } else {
            int i = 2;
            for (;; i++) {
                if (n % i == 0){
                    System.out.print(i + " ");
                    recurse(n / i);
//                    break;
                }

            }
        }

    }


}
