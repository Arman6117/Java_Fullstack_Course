package com.DateAndTime;
//Java 8 Date and Time API

//LocalDate (only date, no time)
//------------------------------
import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // current date
        LocalDate birthday = LocalDate.of(1995, 5, 10); // specific date

        System.out.println("Today: " + today);
        System.out.println("Birthday: " + birthday);
    }
}