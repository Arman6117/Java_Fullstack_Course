package Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int digit,rev = 0;
        int num = n;
        while (num > 0){
            digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if (rev == n){
            System.out.println("Given number is a palindrome number");
        } else {
            System.out.println("Given number is not a palindrome number");
        }
    }
}
