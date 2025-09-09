package com.StringMethods.Assignments;

public class _06_ReverseEachWord {

	public static void main(String[] args) {
		String str = "Hello";
		String[] words = str.split("\\s+");
	    StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse().toString()).append(" ");
        }
        
        System.out.println("String with each word reversed: " + reversedString.toString().trim());
	}

}
