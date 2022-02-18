package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private int grade;

    public Programmer(String name, String surname, String education, int birthday, String specialization, int grade) {
        super(name, surname, education, birthday, specialization);
        this.grade = grade;
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Anna", "Fedorova", "Programmer",  20, "Developer", 9);
        System.out.println("Award at the end of the year: " + programmer.awardAtTheEndOfTheYear(programmer.grade));
    }
}
