package ru.job4j.pojo;

public class Book {
    private String name;
    private int countPaged;

    public Book(String name, int countPaged) {
        this.name = name;
        this.countPaged = countPaged;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountPaged() {
        return countPaged;
    }

    public void setCountPaged(int countPaged) {
        this.countPaged = countPaged;
    }
}
