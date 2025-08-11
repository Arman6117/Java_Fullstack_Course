package _4_ControlStatements;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        String u_email = "abc@b.com";
        String u_pass ="1234";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = in.next();

        System.out.print("Enter your password: ");
        String pass = in.next();

        if(u_email.equals(email) && u_pass.equals(pass)) {
            System.out.println("Successfully logged in");
        } else {
            System.out.println("Please enter valid email and password");
        }
    }
}
