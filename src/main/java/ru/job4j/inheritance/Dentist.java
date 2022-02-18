package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String specialtyInDentistry;

    public Dentist(String name, String surname, String education, int birthday, String department, String specialtyInDentistry) {
        super(name, surname, education, birthday, department);
        this.specialtyInDentistry = specialtyInDentistry;
    }

    public static void main(String[] args) {
        Dentist dentist = new Dentist("Denis", "Petrov", "Dentist", 12, "Orthopedic dentist", "Pediatric Dentist");
        System.out.println("18 age: " + dentist.subdivision(18) + ", time reception: " + dentist.receptionTime(90) + " hours");
        System.out.println("10 age: " + dentist.subdivision(10) + ", time reception: " + dentist.receptionTime(60) + " hours");
    }
}
