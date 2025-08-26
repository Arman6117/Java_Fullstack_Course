package _15_Abstract_Overriding;

import java.util.Scanner;

abstract public class BookTickets {
    int regNo;
    final static int gst = 5;

    public BookTickets(int regNo) {
        this.regNo = regNo;
    }

    public void register() {
        System.out.println("You Registration no: " + regNo);
    }

    abstract void fromTo();

    abstract void bill();
}

class RedBus extends BookTickets {
    Scanner in = new Scanner(System.in);
    int sub = 0;

    public RedBus(int regNo) {
        super(regNo);
    }

    void fromTo() {

        System.out.println("Welcome to Red Bus please choose your destination ");
        System.out.println("1]  Pune to Mumbai: ₹500");
        System.out.println("2]  Pune to Nagar: ₹200");
        System.out.println("3]  Nagar to Mumbai: ₹800");
        System.out.println("4]  Nashik to Mumbai: ₹300");
        System.out.println("5]  Pune to Nashik: ₹250");
        System.out.println("Choose a value");
        int ch = in.nextInt();
        switch (ch) {
            case 1 -> sub = 500;
            case 2 -> sub = 200;
            case 3 -> sub = 800;
            case 4 -> sub = 300;
            case 5 -> sub = 250;
            default -> System.out.println("Choose valid option");
        }

    }
    void bill () {
        System.out.println("Choose quantity of tickets: ");
        int qty = in.nextInt();
        int qSub = sub * qty;
        double subGST = (double) (qSub * gst) /100;
        double total = qSub + subGST ;

        System.out.println("Bus ticket fare: " + sub + "\n No of tickets: " + qty + "\n Ticket rate: " + qSub + "\n GST 5%: " + subGST + "\n Total Bill: " + total);
    }
    static class TravelClient {
        public static void main(String[] args) {
            BookTickets bt = new RedBus(100122);
            bt.register();
            bt.fromTo();
            bt.bill();
        }
    }
}
