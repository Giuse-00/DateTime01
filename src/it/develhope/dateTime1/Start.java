package it.develhope.dateTime1;

import java.time.LocalDate;
import java.time.Year;

public class Start {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        Year year = Year.now();

        int c = today.lengthOfMonth();
        int v = today.getDayOfMonth();

        System.out.println("How many days are left till the end of the month? " + (c - v));

        int x = year.length();
        int z = today.getDayOfYear();

        System.out.println("How many days are left till the end of the year? " + (x - z));

    }
}
