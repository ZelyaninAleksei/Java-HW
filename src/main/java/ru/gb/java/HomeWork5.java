package ru.gb.lerning;
import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {

        HomeWork5 hw5 = new HomeWork5();
        int[] myArray = new int[]{123, -1, 20, 33, -5, 10, 1};
        int summa = hw5.SumIndex(myArray);
        if (summa > 0) {
            hw5.Replacement(myArray, summa);
        }
        System.out.println( Arrays.toString(myArray));
    }

    public int SumIndex(int[] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] >= 10 && myArray[i] <= 99) {
                sum = sum + i;
            }
        }
        return sum;
    }


    public void Replacement(int[] myArray, int sumIndex) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0)
            {
                myArray[i] = sumIndex;
            }
        }
    }

}

