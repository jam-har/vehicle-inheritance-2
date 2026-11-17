package com.pluralsight;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String model, String color, int topSpeed, int numberOfPassengers, int cargoCapacity, int numberOfDoors) {
        super(model, color, topSpeed, numberOfPassengers, cargoCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void openTrunk() {
        System.out.println("The trunk is open!");
    }
    public void closeTrunk() {
        System.out.println("The trunk is closed!");
    }

}
