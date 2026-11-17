package com.pluralsight;

public class Hovercraft extends Vehicle {
    private int airCushionPressure;

    public Hovercraft(String model, String color, int topSpeed, int numberOfPassengers, int cargoCapacity, int airCushionPressure) {
        super(model, color, topSpeed, numberOfPassengers, cargoCapacity);
        this.airCushionPressure = airCushionPressure;
    }

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    public void hover() {
        if (airCushionPressure >= 10) {
            accelerate();
            System.out.println("Your are riding!");
        }
    }

    @Override
    public String toString() {
        return "Hovercraft{" +
                "airCushionPressure=" + airCushionPressure +
                "} " + super.toString();
    }
}
