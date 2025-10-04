package com.DateAndTime;

//Duration (Difference between two times)
//------------------------------------
import java.time.LocalTime;
import java.time.Duration;

public class DurationExample {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(17, 30);

        Duration workHours = Duration.between(start, end);

        System.out.println("Work Hours: " + workHours.toHours() + " hours " 
                           + workHours.toMinutes() % 60 + " minutes");
    }
}