package ru.gb.java;
//3. Сведения о книге состоят из названия,
// фамилии автора, цены, года издания и
// количества страниц. Найти названия книг,
// в которых простое количество страниц,
// фамилия автора содержит «А» и год издания после 2010 г,
// включительно.

public class HW8_1 {

    String titleBook;
    String lastNameAuthor;
    double price;
    int yearPublication;
    int numberPages;

    public static void main(String[] args) {

        HW8_1 book1 = new HW8_1("Война и Мiр", "Толстой", 368.00, 2023, 709);
        HW8_1 book2 = new HW8_1( "Мастер и Маргарита", "Булгаков", 744.00, 2023, 528);
        HW8_1 book3 = new HW8_1("Письма к брату Тео", "Ван Гог", 240.00, 2023, 401);
        HW8_1 book4 = new HW8_1("Колыбель для кошки", "Курт", 266.00, 2023, 288);
        HW8_1 book5 = new HW8_1( "Остров Сахалин", "Чехов", 220.00, 2003, 512);

        HW8_1[] arrayOfObjects = {book1, book2, book3, book4, book5};

        for (int i = 0; i < arrayOfObjects.length; i++) {
            if (arrayOfObjects[i].lastNameAuthor.toUpperCase().contains("А")
                    && arrayOfObjects[i].yearPublication >= 2010
                    && isPrime(arrayOfObjects[i].numberPages))
            {
                System.out.println("Название книги \"" + arrayOfObjects[i].titleBook + "\"");
            }
        }
    }

    HW8_1 (String tb, String lna, double p, int yP, int nP) {
        titleBook = tb;
        lastNameAuthor = lna;
        price = p;
        yearPublication = yP;
        numberPages = nP;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

