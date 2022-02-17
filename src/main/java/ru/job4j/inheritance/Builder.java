package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int discharge;

    public Builder() {

    }

    public Builder(String name, String surname, String education, int birthday) {
        super("Kirill", "Petrov", "Builder", 10);
    }

    public Builder(int discharge) {
        this.discharge = discharge;
    }
}
