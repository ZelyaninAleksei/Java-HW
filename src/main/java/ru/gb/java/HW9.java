package ru.gb.java;

import java.util.*;

public class HW9 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();

        int min = 0;
        int max = 100;

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            list.add(randomNumber);
        }
        System.out.println("Созданный список: \n" + list);

        Collections.sort(list);
        int mini = list.get(0);
        int maxi = list.get(list.size() - 1);
        int avgr = (maxi + mini) / 2;
        System.out.println("Минимальное значение - " + mini + " Максимальное значение - " + maxi + " Среднее значение - " + avgr);

    }
}