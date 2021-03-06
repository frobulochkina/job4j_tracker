package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Drive a bus.");
    }

    @Override
    public void passengers(int amountOfPassengers) {
        System.out.println("Amount of Passengers: " + amountOfPassengers);
    }

    @Override
    public int refuel(int amountOfFuel) {
        return amountOfFuel * 55;
    }
}
