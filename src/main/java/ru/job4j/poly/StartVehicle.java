package ru.job4j.poly;

public class StartVehicle {
    public static void main(String[] args) {
        Vehicle bus = new Autobus();
        Vehicle plane = new Plane();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[] {bus, plane, train};
        for (Vehicle a: vehicles) {
            a.move();
        }
    }
}
