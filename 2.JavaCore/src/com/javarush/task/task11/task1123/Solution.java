package com.javarush.task.task11.task1123;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        int xx = inputArray[0];
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (xx > inputArray[i + 1]){
                xx = inputArray[i + 1];
            }
        }
        int yy = inputArray[0];
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (yy < inputArray[i + 1]){
                yy = inputArray[i + 1];
            }
        }
        // напишите тут ваш код

        return new Pair<Integer, Integer>(xx, yy);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
