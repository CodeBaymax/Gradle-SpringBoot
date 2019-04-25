package com.susu.standardE.ClassLoad.constQuote;

public class ConstClass {

    static {
        System.out.println("ConstClass Static");
    }

    public static final int CONST_VAL = 12;
}
