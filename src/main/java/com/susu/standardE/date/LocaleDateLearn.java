package com.susu.standardE.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocaleDateLearn {
    public static void main(String[] args) {

        System.out.println(LocalDate.now().toString());
        System.out.println(LocalDate.now().minusDays(1).toString());

        System.out.println(LocalDateTime.now().withNano(0));
        System.out.println(LocalDateTime.now());

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now().withNano(0));

    }
}
