package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moves on rails.");
    }

    public static void main(String[] args) {
        Vehicle train0 = new Train();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();

        Vehicle[] train = new Vehicle[] {train0, train1, train2};
        for (Vehicle t: train) {
            t.move();
        }
    }
}
