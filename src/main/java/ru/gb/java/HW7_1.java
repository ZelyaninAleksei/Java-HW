package ru.gb.java;

import java.util.Scanner;
//2. Сведения о товаре состоят из наименования,
// страны-производителя, веса, цены, сорта.
// Получить наименования товаров заданного сорта с наименьшей ценой.


public class HW7_1 {
    String productName;
    String country;
    double weight;
    double price;
    int sort;

    public static void main(String[] args) {

        HW7_1 prod1 = new HW7_1("Рис", "Россия", 10, 630.7, 1);
        HW7_1 prod2 = new HW7_1("Манка", "Белорусь", 10, 1030.3, 1);
        HW7_1 prod3 = new HW7_1("Гречка", "Россия", 5, 430.7, 2);
        HW7_1 prod4 = new HW7_1("Гречка", "КНР", 5, 930.7, 1);
        HW7_1 prod5 = new HW7_1("Манка", "ЮАР", 5, 1930.7, 2);

        HW7_1[] arrayOfObjects = {prod1, prod2, prod3, prod4, prod5};

        System.out.println("Введите сорт: (1 или 2)");
        Scanner sc = new Scanner(System.in);
        int sortF = sc.nextInt();

        double minPrice = arrayOfObjects[0].price;
        String prodName = arrayOfObjects[0].productName;

        for (int i = 1; i < arrayOfObjects.length; i++)
            if (arrayOfObjects[i].sort == sortF) {
                if (arrayOfObjects[i].price < minPrice) {
                    minPrice = arrayOfObjects[i].price;
                    prodName = arrayOfObjects[i].productName;
                }
            }
        System.out.println("Товар: \" " + prodName + " \", цена - " + minPrice + " сорт - " + sortF);
    }

    HW7_1(String n, String c, double w, double p, int s) {
        productName = n;
        country = c;
        weight = w;
        price = p;
        sort = s;
    }

}
