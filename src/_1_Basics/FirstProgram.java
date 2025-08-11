package _1_Basics;

public class FirstProgram {
     int a = 10;
     int  b = 20;
     int c;
     void  sum () {
         c = a  + b;
         System.out.println("Sum is: " + c);
     }
     void multi () {
         c = a  * b;
         System.out.println("Multiplication is: " + c);
     }
    void sub () {
        c = a  - b;
        System.out.println("Subtraction is: " + c);
    }
    void div () {
        c =  b / a;
        System.out.println("Division is: " + c);
    }
    public static void main(String[] args) {
         FirstProgram obj = new FirstProgram();
         obj.sum();
         obj.sub();
         obj.div();
         obj.multi();
    }
}
