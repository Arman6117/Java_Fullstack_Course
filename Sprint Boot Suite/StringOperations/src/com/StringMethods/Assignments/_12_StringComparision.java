package com.StringMethods.Assignments;

public class _12_StringComparision {
    public static void main(String[] args) {
        String input1 = "New York";
        String input2 = "NWYR";
        String output = compareStrings(input1, input2);
        System.out.println("Output: " + output); // Expected: N+w+Y+r+
    }

    public static String compareStrings(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        String s2Lower = s2.toLowerCase(); // Convert s2 to lowercase for case-insensitive comparison

        for (char c : s1.toCharArray()) {
            // Convert current character of s1 to lowercase for comparison
            if (s2Lower.indexOf(Character.toLowerCase(c)) != -1) {
                result.append(c); // Character is present, append as is
            } else {
                result.append('+'); // Character not present, append '+'
            }
        }
        return result.toString();
    }
}