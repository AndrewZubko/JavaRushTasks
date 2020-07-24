package com.javarush.task.task16.task1632;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Jump1());
        threads.add(new Jump2());
        threads.add(new Jump3());
        threads.add(new Jump4());
        threads.add(new Jump5());
    }

    public static class Jump1 extends Thread{
        @Override
        public void run() {
            while(true){
            }

        }
    }

    public static class Jump2 extends Thread{
        @Override
        public void run() {
            try{
                Thread.sleep(1);
            }
            catch (InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Jump3 extends Thread{
        @Override
        public void run() {
            try{
                while(true){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }

            }
            catch (InterruptedException e){

            }
        }
    }

    public static class Jump4 extends Thread implements Message{
        boolean repeat = false;
        @Override
        public void run() {
            while(!repeat){

            }

        }

        @Override
        public void showWarning() {
            repeat = true;
        }
    }

    public static class Jump5 extends Thread{
        @Override
        public void run() {
            ArrayList<Integer> list = new ArrayList<Integer>();
            Scanner read = new Scanner(System.in);
            int i = 0;
            String symv = "";
            symv = read.nextLine();
            try{
                i = Integer.parseInt(symv);
                list.add(i);
            }
            catch (NumberFormatException e){}


            while (!symv.equals("N")){
                symv = read.nextLine();
                try{
                    i = Integer.parseInt(symv);
                    list.add(i);
                }
                catch (NumberFormatException e){}
            }
            int sum = 0;
            for (int j = 0; j < list.size() ; j++) {
                sum += list.get(j);
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {

    }
}