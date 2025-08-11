package _3_Operators;

import java.util.Scanner;

public class Operators {
    int a,b,c;
    void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A");
        a  = sc.nextInt();

        System.out.println("Enter value of B");
        b = sc.nextInt();
        c = a +b;
        System.out.println("Sum of " + a + " and " + b + " is: " + c);

    }
    void sub() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A");
        a  = sc.nextInt();

        System.out.println("Enter value of B");
        b = sc.nextInt();
        c = a -b;
        System.out.println("Subtraction of " + a + " and " + b + " is: " + c);

    }
    void multi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A");
        a  = sc.nextInt();

        System.out.println("Enter value of B");
        b = sc.nextInt();
        c = a *b;
        System.out.println("Multiplication of " + a + " and " + b + " is: " + c);

    }

    void div() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A");
        a  = sc.nextInt();

        System.out.println("Enter value of B");
        b = sc.nextInt();
        c = a /b;
        System.out.println("Division of " + a + " and " + b + " is: " + c);

    }

    void modulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A");
        a  = sc.nextInt();

        System.out.println("Enter value of B");
        b = sc.nextInt();
        c = a %b;
        System.out.println("Remainder of " + a + " and " + b + " is: " + c);

    }
    public static void main(String[] args) {
        Operators obj = new Operators();
        obj.sum();
        obj.sub();
        obj.multi();
        obj.div();
        obj.modulo();
    }
}
