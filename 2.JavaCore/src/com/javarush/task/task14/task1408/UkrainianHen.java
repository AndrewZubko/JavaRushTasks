package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    public int getCountOfEggsPerMonth(){return 40;}
    public String getDescription(){
        String s = super.getDescription();
        s = s + " Моя страна - ";
        s = s + "" + Country.UKRAINE;
        s = s + ". Я несу ";
        s = s + "" + getCountOfEggsPerMonth();
        s = s + " яиц в месяц.";
        return s;
    }
}
