package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int num) {
        return num - x;
    }

    public int divide(int num) {
        return num / x;
    }

    public int sumAllOperation(int num) {
        return sum(num) + multiply(num) + minus(num) + divide(num);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("sum: " + sum(5));
        System.out.println("multiply: " + calc.multiply(5));
        System.out.println("minus: " + minus(5));
        System.out.println("divide: " + calc.divide(5));
        System.out.println("sumAllOperator: " + calc.sumAllOperation(5));
    }
}
