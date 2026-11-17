package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Hovercraft coolGadget = new Hovercraft("christy", "red", 100, 8, 500, 50);
        //coolGadget.setAirCushionPressure(15);
        System.out.println(coolGadget.toString());
        coolGadget.hover();

        SemiTruck semi = new SemiTruck("Peterbilt", "red", 160, 4, 12000, 1);
        //semi.setNumberOfTrailers(2);
        System.out.println(semi.toString());
        semi.loadCargo();
        semi.unloadCargo();


    }
}
