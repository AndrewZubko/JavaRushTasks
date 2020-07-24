package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen{
    public int getCountOfEggsPerMonth(){return 20;}
    public String getDescription(){
        String s = super.getDescription();
        s = s + " Моя страна - ";
        s = s + "" + Country.BELARUS;
        s = s + ". Я несу ";
        s = s + "" + getCountOfEggsPerMonth();
        s = s + " яиц в месяц.";
        return s;
    }
}
