package com.daniel;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void checkTrafficLight() {
        if (getColor().toLowerCase().equals("green")) {
            System.out.println("Light is green, go!!!");
        }
        else if(getColor().toLowerCase().equals("red")) {
            System.out.println("Light is red, stop!!!");
        }
        else {
            System.out.println("Wait you boy!!!");
        }
    }

    public String getColor() {
        return color;
    }

    public void changeColor(String color) {
        this.color = color;
    }

    public int getDuration() {
        return duration;
    }

    public void changeDuration(int duration) {
        this.duration = duration;
    }
}
