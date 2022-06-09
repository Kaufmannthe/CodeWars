package com.codewars.kyu8;

public class Marks {
    public static void main(String[] args) {
        System.out.println(getGrade(60, 70, 80));
    }

    public static char getGrade(int s1, int s2, int s3) {
        int sum = (s1 + s2 + s3) / 3;
        if (90 <= sum && sum <= 100) return 'A';
        if (80 <= sum && sum < 90) return 'B';
        if (70 <= sum && sum < 80) return 'C';
        if (60 <= sum && sum < 70) return 'D';
        if (0 <= sum && sum < 60) return 'F';
        return '0';
    }
}
