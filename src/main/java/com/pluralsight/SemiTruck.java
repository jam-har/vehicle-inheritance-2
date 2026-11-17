package com.pluralsight;

public class SemiTruck extends Vehicle {

    private int numberOfTrailers;

    public SemiTruck(String model, String color, int topSpeed, int numberOfPassengers, int cargoCapacity, int numberOfTrailers) {
        super(model, color, topSpeed, numberOfPassengers, cargoCapacity);
        this.numberOfTrailers = numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    public void loadCargo() {
        System.out.println("You have cargo in " + numberOfTrailers + " trailer!");
    }

    public void unloadCargo() {
        System.out.println("You have emptied the cargo in " + numberOfTrailers + " trailer!");
    }

    @Override
    public String toString() {
        return "SemiTruck{" +
                "numberOfTrailers=" + numberOfTrailers +
                "} " + super.toString();
    }
}
