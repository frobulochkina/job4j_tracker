package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String direction;

    public Surgeon() {

    }

    public Surgeon(String name, String surname, String education, int birthday) {
        super("Fedor", "Michailovich", "Surgeon", 8);
    }

    public Surgeon(String direction) {
        this.direction = direction;
    }

    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        System.out.println("20 age: " + surgeon.subdivision(20) + ", time reception: " + surgeon.receptionTime(120) + " hours");
        System.out.println("5 age: " + surgeon.subdivision(5) + ", time reception: " + surgeon.receptionTime(90) + " hours");
    }
}
