package com.daniel;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Address address = new Address(
                "Foobar Str",
                "NE33",
                "Nigeria"
        );

        Car tesla = new Car(CarBrand.TESLA, new BigDecimal(1500000));

        Car[] cars = {tesla};

        Person alex = new Person("Alex", 23, address, cars);

        System.out.println(alex);
    }
}








