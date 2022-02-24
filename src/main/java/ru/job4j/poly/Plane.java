package ru.job4j.poly;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " flying through the air.");
    }

    public static void main(String[] args) {
        Vehicle plane0 = new Plane();
        Vehicle plane1 = new Plane();
        Vehicle plane2 = new Plane();

        Vehicle[] plane = new Vehicle[] {plane0, plane1, plane2};
        for (Vehicle p: plane) {
            p.move();
        }
    }
}
