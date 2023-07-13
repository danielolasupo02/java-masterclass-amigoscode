package com.daniel.garage;

import com.daniel.car.Car;

public class GarageService {
    //Business Logic to Add Car to Garage
    public boolean addCarToGarage(Car car, Garage garage) {
        if (garage.getCars() == null)
            throw new IllegalArgumentException("Cars cannot be null");

        int count = 0;
        for (Car c: garage.getCars()) {
            if (c != null) {
                count++;
            }
        }
        if(count >= garage.getCapacity()) {
            return false;
        }

        //add car to garage
        return true;

    }
}
