package com.codewars.kyu8;

import java.util.Arrays;

public class Counting {
    public static void main(String[] args) {
        int[] ints = {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14};
        int[] ints1 = {0};
        System.out.println(Arrays.toString(countPositivesSumNegatives(ints)));
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null){
            return new int[]{0};
        }

        int positiveNumber = 0;
        int negativeNumber = 0;

        for (int j : input) {
            if (j < 0) {
                negativeNumber = negativeNumber + j;
            }
            if (j > 0) {
                positiveNumber = positiveNumber + 1;
            }
        }
        return new int[]{positiveNumber, negativeNumber};
    }
}
