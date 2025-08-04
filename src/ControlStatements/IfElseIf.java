package ControlStatements;

import java.util.Scanner;
class IfElseIf
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter app name: ");
        String app=sc.next();

        if(app.equals("Insta")){
            System.out.println("Welcome to Insta");
        }
        else if(app.equals("Gmail")){
            System.out.println("Welcome to Gmail");
        }
        else if(app.equals("LinkedIn")){
            System.out.println("Welcome to LinkedIn");
        }
        else{
            System.out.println("Please enter the valid search");

        }
    }
}