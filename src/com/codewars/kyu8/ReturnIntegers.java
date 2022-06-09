package com.codewars.kyu8;

import java.util.Arrays;

public class ReturnIntegers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(10)));
    }

    public static int[] reverse(int n) {
        int[] ints = new int[n];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = +n;
            n--;

        }
        return ints;
    }

}
