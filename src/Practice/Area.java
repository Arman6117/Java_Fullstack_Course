package Practice;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float a, b, c,ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        a  = sc.nextFloat();
        System.out.println("Enter base: ");
        b = sc.nextFloat();
        c = (a*a )+ (b*b);
        ans =(float)  Math.sqrt(c);

        System.out.println("Hypotenuse is: " + ans);
            }
}
