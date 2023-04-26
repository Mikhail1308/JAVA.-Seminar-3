/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц,
 * фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */


package org.example;

import org.example.Task3.Books;

import java.util.ArrayList;
import java.util.List;

public class Main_3 {
    public static void main(String[] args) {
        Books book1 = new Books("Креативщик", "Борис Акунин", 1200.2, 2011, 2);
        Books book2 = new Books("80 тыс. лье под водой", "Жуль Верн", 2000.99, 2020, 20);
        Books book3 = new Books("Избранное", "Зощенко", 490.9, 1956, 150);
        Books book4 = new Books("Божественная комедия", "Данте Алигьери", 650.9, 2015, 1);
        Books book5 = new Books("Капитал", "Карл Маркс", 960.8, 1915, 5);
        Books book6 = new Books("Аэропорт", "Артур Хэйли", 750.9, 2010, 230);
        Books book7 = new Books("Чапаев и Пустота", "Виктор Пелевин", 490.23, 2023, 100);
        Books book8 = new Books("Черновик", "Сергей Лукъяненко", 20.99, 2017, 130);

        List<Books> booksList = new ArrayList<>();

        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);
        System.out.println(booksList);

        StringBuilder sortedBooks = new StringBuilder();
        for (Books books : booksList) {
            if (isPrime(books.getPgNum()) && books.getAuthor().toLowerCase().contains("а")) {
                if (books.getYear() >= 2010 && books.getYear() <= 2023) {
                    sortedBooks.append(books.getName()).append("\n");
                }
            }
        }
        System.out.println(sortedBooks);
    }

    private static boolean isPrime(Integer num) {

        if (num == 1) {
            return true;
        }
        if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
            return false;
        }
        for (int i = 2; i < num * num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}