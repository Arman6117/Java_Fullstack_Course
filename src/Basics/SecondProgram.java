package Basics;

public class SecondProgram {
     //Global variables
    void  m1() {
        byte b1= 21;
        int a = 34;
        float b = 9.98f;
        double c = 12.03;
        char ch = 'A';
        boolean isP = true;
        String name ="Arman";

        System.out.println(b1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(ch);
        System.out.println(isP);
        System.out.println(name);
    }
    public static void main(String[] args) {
        SecondProgram sp = new SecondProgram();
        sp.m1();
    }
}
