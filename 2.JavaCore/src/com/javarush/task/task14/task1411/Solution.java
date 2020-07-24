package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        int[] num = new int[]{0, 0, 0, 0};
        while (true){
            key = reader.readLine();
            if (key.equals("user")){
                num[0] = num[0] + 1;
            }
            else if (key.equals("loser")){
                num[1] = num[1] + 1;
            }
            else if (key.equals("coder")){
                num[2] = num[2] + 1;
            }
            else if (key.equals("proger")){
                num[3] = num[3] + 1;
            }
            else break;
        }
        //тут цикл по чтению ключей, пункт 1
        for (int i = 0; i < num.length; i++) {
            if (i == 0){
                for (int j = 0; j < num[0]; j++) {
                    Person person1 = new Person.User();
                    doWork(person1);
                }
            }
            if (i == 1){
                for (int j = 0; j < num[1]; j++) {
                    Person person1 = new Person.Loser();
                    doWork(person1);
                }
            }
            if (i == 2){
                for (int j = 0; j < num[2]; j++) {
                    Person person1 = new Person.Coder();
                    doWork(person1);
                }
            }
            if (i == 3){
                for (int j = 0; j < num[3]; j++) {
                    Person person1 = new Person.Proger();
                    doWork(person1);
                }
            }
        }


    }

    public static void doWork(Person person) {
        if (person instanceof Person.User){
            ((Person.User) person).live();
        }
        else if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }
        else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
        else if (person instanceof Person.Coder){
            ((Person.Coder) person).writeCode();
        }
    }
}
