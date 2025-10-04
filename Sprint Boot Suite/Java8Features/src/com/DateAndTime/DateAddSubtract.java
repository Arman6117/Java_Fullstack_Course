package com.DateAndTime;

//Adding and Subtracting Days/Months/Years
//----------------------------------------
import java.time.LocalDate;

public class DateAddSubtract {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate lastMonth = today.minusMonths(1);
        LocalDate nextYear = today.plusYears(1);

        System.out.println("Today: " + today);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Last Month: " + lastMonth);
        System.out.println("Next Year: " + nextYear);
    }
}