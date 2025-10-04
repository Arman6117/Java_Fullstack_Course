package com.DateAndTime;

//LocalTime (only time, no date)
//------------------------------
import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now(); // current time
        LocalTime specific = LocalTime.of(10, 30); // 10:30 AM

        System.out.println("Now: " + now);
        System.out.println("Specific Time: " + specific);
    }
}