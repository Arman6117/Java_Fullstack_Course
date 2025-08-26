package _15_Abstract_Overriding;

import java.util.Scanner;

public  abstract class FoodDelivery {
    int regId;
    final static int GST = 5;
    FoodDelivery(int reg){
        this.regId = regId;
    }
    void register(){
        System.out.println("Register Id : " + regId);
    }
    void Delivery(){

    }
    void Bill() {

    }
}
class Swiggy extends FoodDelivery{
    float sum = 0;
    Swiggy(int reg){
        super(reg);
        System.out.println("Register Id : " + reg);
    }
    void Delivery() {
        int ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Select items");
        System.out.println("1.Pizza");
        System.out.println("2.Burger");
        System.out.println("3.Sandwich");
        System.out.println("4.Cold Coffee");
        System.out.println("5.Fires");
        System.out.println("6.Exit");

        do {
            System.out.print("Enter your choice: ");
            ch = input.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Price: 100Rs");
                    sum += 100;
                    break;
                case 2:
                    System.out.println("Price: 60Rs");
                    sum += 60;
                    break;
                case 3:
                    System.out.println("Price: 80Rs");
                    sum += 80;
                    break;
                case 4:
                    System.out.println("Price: 50Rs");
                    sum += 50;
                    break;
                case 5:
                    System.out.println("Price: 90Rs");
                    sum += 90;
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
            }
        }while (ch != 6);
    }
    void Bill(){
        float subGST = sum * GST/100;
        System.out.println("Your Bill amount is: " + (sum+subGST));
    }
}
class ClientPerson {
    public static void main(String[] args) {
        FoodDelivery obj = new Swiggy(111);
        obj.Delivery();
        obj.Bill();
    }
}