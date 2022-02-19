package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Clean code", 136);
        Book second = new Book("Flowers", 100);
        Book third = new Book("Painting", 340);
        Book fourth = new Book("Cats", 320);
        Book[] arrBook = new Book[4];
        arrBook[0] = first;
        arrBook[1] = second;
        arrBook[2] = third;
        arrBook[3] = fourth;
        for (int index = 0; index < arrBook.length; index++) {
            Book book = arrBook[index];
            System.out.println("In the book " + book.getName() + " " + book.getCountPaged() + " paged");
        }
        Book temp = arrBook[0];
        arrBook[0] = arrBook[3];
        arrBook[3] = temp;
        System.out.println("Replace index 0 and 3:");
        for (int index = 0; index < arrBook.length; index++) {
            Book book = arrBook[index];
            System.out.println("In the book " + book.getName() + " " + book.getCountPaged() + " paged");
        }
        System.out.println("Book with name Clean code:");
        for (int index = 0; index < arrBook.length; index++) {
            Book book = arrBook[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println("In the book " + book.getName() + " " + book.getCountPaged() + " paged");
            }
        }
    }
}
