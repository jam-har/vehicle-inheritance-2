package com.pluralsight;

public class Vehicle {
    private String model;
    private String color;
    private int topSpeed;
    private int numberOfPassengers;
    private int cargoCapacity;

    public Vehicle(String model, String color, int topSpeed, int numberOfPassengers, int cargoCapacity) {
        this.model = model;
        this.color = color;
        this.topSpeed = topSpeed;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }


    public void startEngine() {
    }
    public void stopEngine() {}
    public void accelerate() {}
    public void brake() {}

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", topSpeed=" + topSpeed +
                ", numberOfPassengers=" + numberOfPassengers +
                ", cargoCapacity=" + cargoCapacity +
                '}';
    }
}
