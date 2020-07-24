package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner reader = new Scanner(System.in);
        String s = reader.nextLine();
        if (s.equals(Planet.SUN)){
            thePlanet = Sun.getInstance();
        }
        else if (s.equals(Planet.MOON)){
            thePlanet = Moon.getInstance();
        }
        else if (s.equals(Planet.EARTH)){
            thePlanet = Earth.getInstance();
        }
        else
            thePlanet = null;
    }
}
