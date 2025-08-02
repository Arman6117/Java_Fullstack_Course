package Practice;

import java.util.Scanner;

public class PerimeterAndArea {
    public static void main(String[] args) {
        float r, area,perimeter;

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter radius of circle: ");
        r = sc.nextFloat();

        area = (float) (3.14 * r * r);
        perimeter = (float) (2 * 3.14 * r);

        System.out.println("Area of circle with radius: " + r + " is: " +area);
        System.out.println("Perimeter of circle with radius: " + r + " is: " + perimeter);

    }
}
