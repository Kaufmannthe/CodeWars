package com.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSorting {

    public static void main(String[] args) {
        OrderedList(listReturn());
        UnorderedList(listReturn());

    }

    public static void OrderedList(List<String> list) {
        System.out.print("Ordered list: ");
        list.stream()
                .sorted((s1, s2) -> -s1.compareTo(s2))
                .map(p1 -> p1 + ", ").forEach((p) -> Arrays.stream(p.split("\\d+"))
                        .toList().forEach(System.out::print));
        System.out.println();


    }

    public static void UnorderedList(List<String> list) {
        System.out.print("Unordered list: ");
        list.stream()
                .sorted(String::compareTo)
                .map(p1 -> p1 + ", ").forEach((p) -> Arrays.stream(p.split("\\d+"))
                        .toList().forEach(System.out::print));
        System.out.println();
    }

    public static List<String> listReturn() {
        String[] array = {"name", "surname", "age", "family", "job", "core", "night"};
        ArrayList<String> arrayList = new ArrayList<>();
        int count = 0;
        for (String s : array) {
            Pattern pattern = Pattern.compile("[aeiouy]");
            Matcher matcher = pattern.matcher(s);

            while (matcher.find()) {
                count++;
            }
            String s1 = count + s;
            arrayList.add(s1);
            count = 0;
        }
        return arrayList;
    }
}
