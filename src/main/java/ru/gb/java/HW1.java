package ru.gb.java;

import java.util.Scanner;

public class HW1 {
    public static String reverse(String UserStr) {
        UserStr = UserStr.trim();
        String[] words = UserStr.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите предложение -> ");
        String UserStr = input.nextLine();
        String result = reverse(UserStr);
        System.out.print(result);
    }
}
