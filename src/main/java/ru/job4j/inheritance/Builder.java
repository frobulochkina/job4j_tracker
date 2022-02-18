package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int discharge;

    public Builder(String name, String surname, String education, int birthday, String specialization, int discharge) {
        super(name, surname, education, birthday, specialization);
        this.discharge = discharge;
    }

    public static void main(String[] args) {
        Builder builder = new Builder("Fedor", "Ivanov", "Builder",  23, "Carpenter", 5);
        System.out.println("Award at the end of the year: " + builder.awardAtTheEndOfTheYear(builder.discharge));
    }
}
