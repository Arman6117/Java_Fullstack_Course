package Practice;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Original Price: ");
        double price = input.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discount = input.nextDouble();

        double finalPrice = price - (price * discount / 100);

        System.out.println("Final Price after discount: " + finalPrice);
    }
}
