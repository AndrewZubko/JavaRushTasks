package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement element = Thread.currentThread().getStackTrace()[2];
        //System.out.println(element.getMethodName());
        return element.getMethodName();
    }

    public static String method2() {
        method3();
        StackTraceElement element = Thread.currentThread().getStackTrace()[2];
        //System.out.println(element.getMethodName());

        return element.getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement element = Thread.currentThread().getStackTrace()[2];
        //System.out.println(element.getMethodName());

        return element.getMethodName();
    }

    public static String method4() {
        method5();
        StackTraceElement element = Thread.currentThread().getStackTrace()[2];
        //System.out.println(element.getMethodName());

        return element.getMethodName();
    }

    public static String method5() {
        StackTraceElement element = Thread.currentThread().getStackTrace()[2];
        //System.out.println(element.getMethodName());

        return element.getMethodName();
    }
}
