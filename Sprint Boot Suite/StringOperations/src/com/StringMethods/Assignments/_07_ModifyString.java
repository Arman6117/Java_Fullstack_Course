package com.StringMethods.Assignments;

public class _07_ModifyString {
    public static String modifyStringPattern(String input) {
        String[] words = input.split("\\s+"); // split by spaces
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            // Odd position → uppercase
            if (i % 2 == 0) {
                result.append(word.toUpperCase());
            } 
            // Even position → reverse
            else {
                result.append(new StringBuilder(word).reverse());
            }

            // Add space except last
            if (i < words.length - 1) result.append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "This is a test String!!";
        System.out.println("Output: " + modifyStringPattern(input));
    }                                                                                                         
}