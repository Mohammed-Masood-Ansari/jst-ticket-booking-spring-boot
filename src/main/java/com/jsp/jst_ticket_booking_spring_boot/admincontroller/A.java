package com.jsp.jst_ticket_booking_spring_boot.admincontroller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

public class A {

    public static void main(String[] args) {

        String day = "monday";

        LocalDate localDate = LocalDate.now();

        DayOfWeek weekDay =localDate.getDayOfWeek();

        System.out.println(weekDay);

        Month month =localDate.getMonth();

        Random rnd = new Random();
        long n = 1000000000 + rnd.nextLong(900000000);
        System.out.println(n);


    }
}
