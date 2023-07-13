package com.daniel;

import com.daniel.car.Car;
import com.daniel.car.CarService;
import com.daniel.person.Person;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        carExamples();

    }

    private static void carExamples() {
        Car car = new Car(
                "1234",
                BigDecimal.TEN
        );

        CarService carService = new CarService();

        carService.registerNewCar(car);

        System.out.println(Arrays.toString(carService.getCars()));
    }
}








