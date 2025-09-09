package com.StringMethods.Assignments;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _10_EvenPositionWords {
    public static String[] getEvenPositionWords(String str) {
        String[] words = str.split(" ");
        List<String> evenWordsList = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) { // Even positions are 1, 3, 5... (0-indexed)
                evenWordsList.add(words[i]);
            }
        }
        return evenWordsList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String input = "java is super keka easy and awesome";
        String[] result = getEvenPositionWords(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + Arrays.toString(result));
    }
}