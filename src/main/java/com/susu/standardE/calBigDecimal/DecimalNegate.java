package com.susu.standardE.calBigDecimal;

import java.math.BigDecimal;

public class DecimalNegate {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("2");

        System.out.println(bigDecimal);

        bigDecimal = bigDecimal.negate();

        System.out.println(bigDecimal);
    }
}
