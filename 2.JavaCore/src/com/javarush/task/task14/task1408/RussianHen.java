package com.javarush.task.task14.task1408;

class RussianHen extends Hen {
    public int getCountOfEggsPerMonth(){return 50;}
    public String getDescription(){
        String s = super.getDescription();
        s = s + " Моя страна - ";
        s = s + "" + Country.RUSSIA;
        s = s + ". Я несу ";
        s = s + "" + getCountOfEggsPerMonth();
        s = s + " яиц в месяц.";
        return s;
    }
}
