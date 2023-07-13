package com.daniel.car;

public class CarDAO {
    //Code for storing car objects to database
    private static Car[] cars;
    private static int nextAvailableSlot = 0;//index to track available slots
    public static final int CAPACITY = 5;//max capacity
    //Car storage is defined
    static {
        cars = new Car[CAPACITY];//Car array defined with max capacity
    }
    //Method for storing car object to database
    public void saveCar (Car car) {
        //database is grown if available slot exceeds 100
        if(nextAvailableSlot + 1 >= CAPACITY) {
            //grow db
        }
        //after database is grown to accomodate more cars, more cards are stored
        cars[nextAvailableSlot]  = car;
        ++nextAvailableSlot;
    }
    public Car[] selectAllCars() { //Method that returns an array of cars from the database
        return cars;
    }


}
