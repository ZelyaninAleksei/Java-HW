package ru.gb.java;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num;
        int prev = 0;

        while (true) {
            System.out.print("Введите число (0 для завершения ввода): ");
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }

            if (num > 0) {
                prev = num;
            } else if (num < 0 && prev > 0) {
                sum += prev;
            }
        }

        System.out.println("Сумма положительных чисел, перед которыми стоит отрицательное: " + sum);
    }
}


