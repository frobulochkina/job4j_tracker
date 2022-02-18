package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Olga Grishina");
        student.setGroup("AD-12LN");
        student.setDateOfReceipt(new Date());

        System.out.println(student.getFullName() + " from the group: " + student.getGroup() + ", received: " + student.getDateOfReceipt());
    }
}
