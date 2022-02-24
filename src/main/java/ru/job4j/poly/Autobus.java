package ru.job4j.poly;

public class Autobus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moving on high-speed highways.");
    }

    public static void main(String[] args) {
        Vehicle autobus0 = new Autobus();
        Vehicle autobus1 = new Autobus();
        Vehicle autobus2 = new Autobus();

        Vehicle[] autobus = new Vehicle[] {autobus0, autobus1, autobus2};
        for (Vehicle a: autobus) {
            a.move();
        }
    }
}
