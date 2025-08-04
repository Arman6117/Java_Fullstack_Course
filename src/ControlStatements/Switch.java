package ControlStatements;

import java.util.Scanner;

class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Groceries: ");
        String req = sc.next();


        //Lambda Expression ->
		switch(req){
			case "fruits" -> {
			 System.out.println("Enjoy the Fruits");
			 System.out.println("Enjoy the Seasonal Fruits Day");
			}
			case "veg" ->  System.out.println("Enjoy the Green Veg");
			case "nonveg" -> System.out.println("Enjoy the NonVeg");
			default -> System.out.println("Please search for available items");
		}


        System.out.println("Enter Day: ");
        int day = sc.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");

            case 6, 7 -> System.out.println("Week-Ends");

            default -> System.out.println("Enter Valid days");

        }


    }
}