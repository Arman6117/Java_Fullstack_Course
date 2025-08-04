package Practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int fact = 1;
        if(n == 0) fact = 1;
        for (int i = 1; i <= n; i++){
            fact  *= i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
     }
}
