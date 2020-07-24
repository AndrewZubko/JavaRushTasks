package com.javarush.task.task17.task1714;

/* 
Comparable
*/

import sun.management.MappedMXBeanType;

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int result = 0;
        if (this.distance < o.distance){
            result++;
        }
        else if (this.distance > o.distance){
            result--;
        }
        if (this.quality > o.quality){
            result++;
        }
        else if (this.quality < o.quality){
            result--;
        }
        return result;
    }

    public static void main(String[] args) {
        Beach one = new Beach("one", 10.15f, 10);
        Beach two = new Beach("two", 15.12f, 5);
        Beach three = new Beach("three", 7.75f, 7);
        System.out.println(one.compareTo(two));
        System.out.println(two.compareTo(one));
        System.out.println(one.compareTo(three));
        System.out.println(three.compareTo(one));
        System.out.println(two.compareTo(three));
        System.out.println(three.compareTo(two));

    }
}
