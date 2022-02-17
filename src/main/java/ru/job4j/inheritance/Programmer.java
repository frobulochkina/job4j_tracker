package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private int grade;

    public Programmer() {

    }

    public Programmer(String name, String surname, String education, int birthday) {
        super("Irina", "Sokolova", "Programmer", 8);
    }

    public Programmer(int grade) {
        this.grade = grade;
    }
}
