package com.codewars.kyu8;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(solution("name"));
    }

    public static String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String result = stringBuilder.reverse().toString();

        return result;
    }

}