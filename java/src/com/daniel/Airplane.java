package com.daniel;
import java.util.Date;

public class Airplane {
    private String flightCode;
    private String destination;
    private Date departureTime;
    private int delayTime;


    public void checkStatus() {
        if (delayTime == 0) {
            System.out.println("Flight not delayed");
        }
        else {
            System.out.println("Flight delayed");
        }
    }


    public Airplane(String flightCode, String destination) {
        this.flightCode = flightCode;
        this.destination = destination;
        this.departureTime = new Date();
        this.delayTime = 0;
    }



    public void printFlightDetails() {
        System.out.println("Flight Code: " + flightCode);
        System.out.println("Flight Destination: " + destination);
        System.out.println("Flight Departure Time: " + departureTime);
        checkStatus();
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public int getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(int delayTime) {
        this.delayTime = delayTime;
    }
}
