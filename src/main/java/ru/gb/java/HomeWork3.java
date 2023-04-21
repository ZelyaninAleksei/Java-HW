package ru.gb.lerning;

import java.util.Scanner;

public class HomeWork3 {
    int sum = 0;

    public static void main(String[] args) {
        HomeWork3 hw3 = new HomeWork3();
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите длину последовательности: ");
        int len_num = scn.nextInt();
        hw3.sum = user_num(len_num);
        System.out.println("Сумма простых чисел: " + hw3.sum);
    }

    public static int user_num(int len_num) {
        Scanner scn = new Scanner(System.in);
        int summa = 0;
        for (int i = 1; i <= len_num; i++) {
            System.out.println("Введите число: ");
            int num = scn.nextInt();
            if (check_num(num)) {
                summa = summa + num;
            }
        }
        return summa;
    }

    public static boolean check_num(int num) {
        if (num == 1) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
