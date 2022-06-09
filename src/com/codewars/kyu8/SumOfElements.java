package com.codewars.kyu8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class SumOfElements {
    public static void main(String[] args) {
        int[] ints = {10, 5, 25, 2, 5, 4};
        int[] ints1 = {};
        System.out.println(sum(ints));

    }

    public static int sum(int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        Arrays.sort(numbers);
        int result = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            result = result + numbers[i];
        }
        return result;
    }
}

