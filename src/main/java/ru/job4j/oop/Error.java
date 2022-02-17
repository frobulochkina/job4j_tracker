package ru.job4j.oop;

public class Error {

    boolean active;

    int status;

    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfoError() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error errorDef = new Error();
        errorDef.printInfoError();
        Error errorWithParam = new Error(false, 403, "Forbidden");
        errorWithParam.printInfoError();
        Error errorWithParam1 = new Error(false, 404, "Not Found");
        errorWithParam1.printInfoError();
        Error errorWithParam2 = new Error(true, 200, "OK");
        errorWithParam2.printInfoError();
    }
}
