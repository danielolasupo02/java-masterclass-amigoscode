package com.daniel.car;

public class CarService {
    private CarDAO carDAO;//import object of data access object class


    public CarService() {
        this.carDAO = new CarDAO();
    }



    //Business Logic to Register New Car
    public int registerNewCar(Car car){
        //check if car is not null
        //check if reg number is valid
        //check if reg number is taken
        //if price is < 0

        //call the method of dao that saves car to database
        carDAO.saveCar(car);
        return 1;
    }

    public Car[] getCars() {//all cars gotten from DAO or database class being selected
        return carDAO.selectAllCars();
    }
}
