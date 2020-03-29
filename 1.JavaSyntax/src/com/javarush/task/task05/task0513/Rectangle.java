package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize (int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize (Rectangle rectangle){
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.height = rectangle.height;
        this.width = rectangle.width;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.initialize(4,5,77);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.initialize(rectangle1);

        System.out.println(rectangle1.top + " " + rectangle1.height);
        System.out.println(rectangle2.left + " " + rectangle2.width);
    }
}
