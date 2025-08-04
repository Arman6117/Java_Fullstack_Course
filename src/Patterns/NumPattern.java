package Patterns;

import java.util.Scanner;

public class NumPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j  = 1; j<=i;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Reverse");
        for (int i = n; i >= 1; i--) {
            for (int j  = 1; j<=i;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
