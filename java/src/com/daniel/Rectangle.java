package com.daniel;

public class Rectangle {
    int width;
    int height;


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int rectArea() {
        return getWidth()*getHeight();
    }

    public int rectPerimeter() {
        return 2*(getHeight()+getHeight());
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


}
