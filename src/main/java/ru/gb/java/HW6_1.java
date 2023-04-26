package ru.gb.java;

//1. Дан массив записей:
// наименование товара, цена, сорт.
// Найти наибольшую цену товаров
// 1го или 2го сорта среди товаров,
// название которых содержит «высший».

public class HW6_1 {
    String productName;
    double price;
    int sort;

    public static void main(String[] args) {

        HW6_1 prod1 = new HW6_1("Гречка", 33.5, 1);
        HW6_1 prod2 = new HW6_1("Рис высший", 63.7, 1);
        HW6_1 prod3 = new HW6_1("Рис", 55.5, 2);
        HW6_1 prod4 = new HW6_1("Манка высший", 66.21, 1);
        HW6_1 prod5 = new HW6_1("Пшено высший", 30.03, 2);

        HW6_1[] arrayOfObjects = {prod1, prod2, prod3, prod4, prod5};

        double maxPrice = arrayOfObjects[0].price;

        for (int i = 1; i < arrayOfObjects.length; i++) {
            if (arrayOfObjects[i].productName.contains("высший")) {
                if (arrayOfObjects[i].price > maxPrice) maxPrice = arrayOfObjects[i].price;
            }
        }
        System.out.println("Максимальная цена товара с наименованием \"Высший\": " + maxPrice);
    }

    HW6_1(String n, double p, int s) {
        productName = n;
        price = p;
        sort = s;
    }
}
