package com.codewars.kyu8;

public class NegativeNumber {
    public static void main(String[] args) {
        System.out.println(makeNegative(0));

    }
    public static int makeNegative(final int x){
        if (x < 0){
            return x;
        }

        return Math.negateExact(x);
    }
}
