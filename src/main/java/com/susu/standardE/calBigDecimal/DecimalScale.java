package com.susu.standardE.calBigDecimal;

import java.math.BigDecimal;

public class DecimalScale {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("1.065");
        BigDecimal b2 = new BigDecimal("1.061");
        BigDecimal b3 = new BigDecimal("1.066");
        BigDecimal b4 = new BigDecimal(1.5);
        BigDecimal b5 = new BigDecimal(1.3);
        BigDecimal b6 = new BigDecimal(1.6);

        printRoundHalfUp(b1,2);
        printRoundHalfUp(b2,2);
        printRoundHalfUp(b3,2);

        printRoundHalfUp(b4,0);
        printRoundHalfUp(b5,0);
        printRoundHalfUp(b6,0);
    }

    private static void printRoundHalfUp(BigDecimal bigDecimal, int i) {
        System.out.print(bigDecimal);
        System.out.print("--------");
        System.out.println(bigDecimal.setScale(i, BigDecimal.ROUND_HALF_UP));
    }

    private static void printRoundHalfDown(BigDecimal bigDecimal, int i) {
        System.out.println(bigDecimal.setScale(i, BigDecimal.ROUND_HALF_DOWN));
    }

//    private static void printRoundHalfUp(BigDecimal bigDecimal) {
//        System.out.println(bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP));
//    }
}
