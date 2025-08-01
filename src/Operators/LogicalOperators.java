package Operators;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();


//        if ((year % 400 == 0 )|| ((year % 4 == 0) && (year % 100 != 0))) {
//            System.out.println(year + " is a leap year");
//        } else  {
//            System.out.println(year + " is not a leap year");
//        }

        String result = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? "Leap year" : "Not leap";
        System.out.println(result);
    }
}
