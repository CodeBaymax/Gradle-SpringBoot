package com.susu.standardE.calBigDecimal;

import java.math.BigDecimal;

public class DecimalCalculate {

    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("5");

        System.out.println(b1);
        System.out.println(b1.multiply(new BigDecimal("2")));
        System.out.println(b1);
        b1 = b1.multiply(new BigDecimal("2"));
        System.out.println(b1);
    }
}
