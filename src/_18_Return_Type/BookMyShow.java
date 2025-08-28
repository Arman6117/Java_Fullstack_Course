package _18_Return_Type;

import java.util.Scanner;

interface Movie {
    void bookTicket();
}


class Cineplex implements Movie {
    public void bill(int noOfTickets, int price, String movieName) {
        int finalPrice = noOfTickets * price;
        System.out.println("Your Bill");
        System.out.println("---------------------------------");
        System.out.println("Movie Name: " + movieName);
        System.out.println("No of Tickets: " + noOfTickets);
        System.out.println("---------------------------------");
        System.out.println("Total Price: " + finalPrice);
    }


    public void bookTicket() {
        int choice, qty;
        Scanner in = new Scanner(System.in);
        System.out.println("Currently Playing..");
        System.out.println("1] War - 2 \n Ticket price => 250/-");
        System.out.println("2] John Wick \n Ticket price => 150/-");
        System.out.println("3] Avengers \n Ticket price => 150/-");
        System.out.println("Choose a movie");

        choice = in.nextInt();
        System.out.println("Choose no of tickets");
        qty = in.nextInt();
        switch (choice) {
            case 1 -> bill(qty, 250, "War-2");
            case 2 -> bill(qty, 150, "John Wick");
            case 3 -> bill(qty, 150, "Avengers");
        }
    }
}

class ServiceProvider {
    Scanner in = new Scanner(System.in);
    public Movie bookMyShow() {
        System.out.println("Choose Theatre: ");
        System.out.println("1] Cineplex");
        System.out.println("2] Conplex");
        int select = in.nextInt();
       if(select == 1) return  new Cineplex();
       if (select == 2) return  new Cineplex();
       else return null;
    }
}

public class BookMyShow {
    public static void main(String[] args) {
        ServiceProvider sp  = new ServiceProvider();
        Movie m = sp.bookMyShow();
        m.bookTicket();
    }
}