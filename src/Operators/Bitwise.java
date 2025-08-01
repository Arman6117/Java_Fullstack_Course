package Operators;

public class Bitwise {
    public static void main(String[] args) {
        int a = 7 , b = 5;
        /*
            7 => 0 1 1 1
            5 => 0 1 0 1
            --------------------
            & => 0 1 0 1 => 5
            |  => 0 1 1 1 => 7
            ^ => 0 0 1 0 => 2
         */
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
    }
}
