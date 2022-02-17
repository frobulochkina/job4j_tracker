package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String specialization;

    public Engineer() {

    }

    public Engineer(String name, String surname, String education, int birthday) {
        super("Ivan", "Ivanov", "Inventor", 22);
    }

    public Engineer(String specialization) {
        this.specialization = specialization;
    }
}
