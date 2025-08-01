package Basics;

import java.util.Scanner;

public class Reading {
    byte a;
    short b;
    int c;
    float d;
    double e;
    long f;
    boolean g;
    String h;

    void readData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter byte: ");
        a = in.nextByte();
        System.out.println("Enter short: ");
        b = in.nextShort();
        System.out.println("Enter int: ");
        c = in.nextInt();
        System.out.println("Enter float: ");
        d = in.nextFloat();
        System.out.println("Enter double: ");
        e = in.nextDouble();
        System.out.println("Enter long: ");
        f = in.nextLong();
        System.out.println("Enter boolean: ");
        g = in.nextBoolean();
        System.out.println("Enter string: ");
        h = in.next();
    }

    void task() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }

    public static void main(String[] args) {
        Reading obj = new Reading();
        obj.readData();
        obj.task();
    }
}
