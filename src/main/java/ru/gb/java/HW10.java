package ru.gb.java;

import java.util.*;

public class HW10 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> reverse = new Stack<Integer>();

        System.out.print("Введите количество элементов списка: ");
        Scanner sc = new Scanner(System.in);
        int sizeStack = sc.nextInt();

        for (int i = 0; i < sizeStack; i++) {
            System.out.print("Введите значение: ");
            stack.push(enteringElement());
        }
        System.out.println("Созданный список: " + stack);

        for (int i = 0; i < sizeStack; i++) {
            reverse.push(stack.pop());
        }
        System.out.println("Реверсивный список: " + reverse);
    }
    /**
     *
     * @return - возращает целочислительное значение,
     * введённое с клавиатуры
     */
    public static int enteringElement() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }
}



