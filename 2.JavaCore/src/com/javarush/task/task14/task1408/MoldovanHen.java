package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    public int getCountOfEggsPerMonth(){return 30;}
    public String getDescription(){
        String s = super.getDescription();
        s = s + " Моя страна - ";
        s = s + "" + Country.MOLDOVA;
        s = s + ". Я несу ";
        s = s + "" + getCountOfEggsPerMonth();
        s = s + " яиц в месяц.";
        return s;
    }
}
