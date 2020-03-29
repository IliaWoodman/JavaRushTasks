package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код top, left, width и height с типом int.
    int top;
    int left;
    int width;
    int height;

    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
    }
    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public Rectangle(Rectangle rectangle){
        this.top = rectangle.top;
        this.left = rectangle.left;

    }

    public static void main(String[] args) {

    }
}
