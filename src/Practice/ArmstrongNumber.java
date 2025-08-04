package Practice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int num = n;
        int sum = 0, cnt = 0;
        while (num > 0) {
            num /= 10;
            cnt++;
        }
        num = n;
        while (num > 0) {
            int rem = num % 10;
            sum += (int) Math.pow(rem, cnt);
            num /= 10;
        }
        if (n == sum) {
            System.out.println("Given number is an Armstrong number");
        } else {
            System.out.println("Given number is not an Armstrong number");
        }
    }
}
