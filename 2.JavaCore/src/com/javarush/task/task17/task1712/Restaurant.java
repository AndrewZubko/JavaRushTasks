package com.javarush.task.task17.task1712;

import java.util.ArrayList;
import java.util.List;

/* 
Ресторан
*/

public class Restaurant {
    public static List<Thread> threads = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Waiter waiterTarget = new Waiter();
        Thread waiter = new Thread(waiterTarget);
        threads.add(waiter); //добавили поток официанта в лист

        Cook cookTarget = new Cook();
        Thread cook = new Thread(cookTarget);
        threads.add(cook); //добавили поток повара в лист

        waiter.start(); //запустили нить официанта
        cook.start(); //запускаем нить повара

        Thread.sleep(2000);//спит 2 сек и закрывает кухню
        cookTarget.continueWorking = false;
        Thread.sleep(500); //спит ещё пол сек и нахуй официанта
        waiterTarget.continueWorking = false;
    }
}
