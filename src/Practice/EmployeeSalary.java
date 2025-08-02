package Practice;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = input.nextDouble();

        double hra = 0.20 * basic;
        double da = 0.50 * basic;
        double total = basic + hra + da;

        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (50%): " + da);
        System.out.println("Total Salary: " + total);
    }
}
