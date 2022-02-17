package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String department;

    public Doctor() {

    }

    public Doctor(String name, String surname, String education, int birthday) {
        super("Anna", "Nikolaevna", "Therapist", 16);
    }

    public Doctor(String department) {
        this.department = department;
    }

    public double receptionTime(double min) {
        return min / 60;
    }

    public String subdivision(int age) {
        if (age < 18) {
            return "Pediatric dentistry";
        } else {
            return "Adult dentistry";
        }
    }
}
