package Practice;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        if (n > 0) {
            System.out.println("Given number is a positive number");
        } else if (n == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Given  number is a negative number");
        }
    }
}
