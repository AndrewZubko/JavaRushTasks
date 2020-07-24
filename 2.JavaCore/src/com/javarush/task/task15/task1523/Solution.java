package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    int x;
    int y;
    int z;
    public Solution() {
    }
    private Solution(int x) {
    }
    protected Solution(int x, int y){}
    Solution(int y, int x, int z){}

    public static void main(String[] args) {

    }
}

