package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до " + Math.min(count, 3) + ": ");
            String str = input.nextLine();
            boolean lineNotEmpty = str.length() != 0;
            if (lineNotEmpty) {
                int matches = Integer.parseInt(str);
                if (matches > 0 && matches <= Math.min(count, 3)) {
                    turn = !turn;
                    count -= matches;
                    System.out.println("Осталось: " + count + " спичек.");
                } else {
                    System.out.println("Ошибка! Введите число от 1 до " + Math.min(count, 3) + ": ");
                }
            } else {
                System.out.println("Осталось: " + count + " спичек.");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
