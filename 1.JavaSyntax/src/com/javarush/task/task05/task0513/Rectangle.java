package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top;    //верхняя координата
    int left;   //левая
    int width = 0;  //ширина
    int height = 0; //высота

    public void initialize(int left, int top, int width, int height){
        this.left = left;
        this. top = top;
        this.width = width;
        this.height = height;
    }
    public void initialize(int left, int top){
        this.left = left;
        this. top = top;
    }
    public void initialize(int left, int top, int width){
        this.left = left;
        this. top = top;
        this.width = width;
        this.height = width;
    }
    public void initialize(Rectangle rectangle){
        this.left = rectangle.left;
        this. top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {

    }
}
