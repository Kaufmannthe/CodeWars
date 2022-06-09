package com.codewars.kyu8;


public class RepeatSTR {
    public static void main(String[] args) {
        repeatStr(10,"Hello");
    }

    public static String repeatStr(final int repeat, final String string) {
        for (int i = 0; i <= repeat; i++) {
            System.out.println(string);
        }
        return "";
    }
}
