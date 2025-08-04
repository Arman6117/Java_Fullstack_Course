package Practice;

import java.util.Scanner;

public class DigitOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter the digit to count: ");
        int digit = sc.nextInt();

        int count = 0;
        int temp = number;

        while (temp > 0) {
            int rem = temp % 10;
            if (rem == digit) count++;
            temp /= 10;
        }

        System.out.println("Digit " + digit + " occurred " + count + " times in " + number);
    }
}
