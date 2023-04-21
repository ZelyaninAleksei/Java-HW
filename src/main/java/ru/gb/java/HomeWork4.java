package ru.gb.lerning;
import java.util.Scanner;
public class HomeWork4 {

    public static void main(String[] args) {
        HomeWork4 hw4 = new HomeWork4();
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите длину последовательности: ");
        int len_num = scn.nextInt();
        hw4.enterNumber(len_num);
    }

    public void enterNumber(int len_num) {
        Scanner scn = new Scanner(System.in);
        int numPrev = 0;
        int num = 0;
        for (int i = 1; i <= len_num ; i++)
        {
            System.out.print("Введите число: ");
            if (i == 1)
            {
                numPrev = scn.nextInt();
            }
            else
            {
                num = scn.nextInt();
                if (numPrev >= num )
                {
                    System.out.println("Последовательность не является возрастающей");
                    return;
                }
                else {
                    numPrev = num;
                }
            }
        }
        System.out.println("Последовательность является возрастающей");
    }
}