package com.StringMethods.Assignments;

public class _11_MaxLength {
    public static String findMaxLengthWord(String str) {
        String[] words = str.split(" ");
        String maxLengthWord = "";

        for (String word : words) {
            if (word.length() > maxLengthWord.length()) {
                maxLengthWord = word;
            }
        }
        return maxLengthWord;
    }

    public static void main(String[] args) {
        System.out.println("Input: hello how are you Moooommmmm");
        System.out.println("Output: " + findMaxLengthWord("hello how are you Moooommmmm"));
        System.out.println("Input: hello how are you reddy");
        System.out.println("Output: " + findMaxLengthWord("hello how are you reddy"));
    }
}