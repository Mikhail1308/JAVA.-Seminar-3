/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */

package org.example;

import org.example.Task2.Items2;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Items2 item1 = new Items2("Манго", "Тайланд", 310.4, 500.0, 1);
        Items2 item2 = new Items2("Бананы", "Тайланд", 207.7, 225.0, 3);
        Items2 item3 = new Items2("Масло", "Россия", 230.4, 180.0, 2);
        Items2 item4 = new Items2("Мука", "Белорусия", 670.5, 1000.0, 1);
        Items2 item5 = new Items2("Хлеб", "Россия", 45.5, 400.0, 2);
        Items2 item6 = new Items2("Тан", "Узбекистан", 20.5, 500.0, 1);
        Items2 item7 = new Items2("Устрицы королевские высший сорт", "Тайланд", 490.0, 800.0, 1);
        Items2 item8 = new Items2("Боржом", "Грузия", 85.5, 500.0, 1);

        List<Items2> itemsList2 = new ArrayList<>();

        itemsList2.add(item1);
        itemsList2.add(item2);
        itemsList2.add(item3);
        itemsList2.add(item4);
        itemsList2.add(item5);
        itemsList2.add(item6);
        itemsList2.add(item7);
        itemsList2.add(item8);

        System.out.println(itemsList2);
        int ourSort = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("Введите номер сорта (1, 2, 3)");
            String sort = scanner.nextLine();
            try {
                if (Integer.parseInt(sort) > 0 && Integer.parseInt(sort) <= 3) {
                    flag = false;
                    ourSort = Integer.parseInt(sort);
                }
            } catch (Exception e) {
                System.out.println("Это не число 1, 2, 3. Попробуйте еще раз.");
            }
        }
        scanner.close();

        double minPrice = itemsList2.get(0).getPrice();
        for (Items2 items2 : itemsList2) {

            if (items2.getSort().equals(ourSort)) {
                if (items2.getPrice() < minPrice) {
                    minPrice = items2.getPrice();
                }
            }
        }
        StringBuilder ourNames = new StringBuilder();
        for (Items2 items2 : itemsList2) {

            if (items2.getSort().equals(ourSort) && (items2.getPrice() == minPrice)) {
                ourNames.append(items2.getName()).append("\n");
            }
        }
        System.out.println("Самые бюджетные товары сорта " + ourSort + ": \n" + ourNames);

    }
}
