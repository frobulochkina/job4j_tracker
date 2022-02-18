package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String specialization;

    public Engineer(String name, String surname, String education, int birthday, String specialization) {
        super(name, surname, education, birthday);
        this.specialization = specialization;
    }

    public int awardAtTheEndOfTheYear(int gradeOrDischarge) {
        return gradeOrDischarge * 10000;
    }
}
