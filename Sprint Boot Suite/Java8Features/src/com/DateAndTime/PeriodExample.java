package com.DateAndTime;

//Period (Difference between two dates)
//-----------------------------------
import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1995, 5, 10);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthday, today);

        System.out.println("Age: " + age.getYears() + " years " 
                           + age.getMonths() + " months " 
                           + age.getDays() + " days");
    }
}