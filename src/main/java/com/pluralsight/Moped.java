package com.pluralsight;

public class Moped extends Vehicle {
    private int maxWeight;

    public Moped(String model, String color, int topSpeed, int numberOfPassengers, int cargoCapacity, int maxWeight) {
        super(model, color, topSpeed, numberOfPassengers, cargoCapacity);
        this.maxWeight = maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void ride() {
        startEngine();
        accelerate();
        System.out.println("You are riding! Please ride with only " + (getNumberOfPassengers() - 1));
    }

}
