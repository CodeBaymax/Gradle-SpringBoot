package com.susu.standardE.ClassLoad.subQuoteParentStatic;

public class SubStatic extends SubParentStatic {
    static {
        System.out.println("SubStatic Static");
    }

    public SubStatic() {
        System.out.println("SubStatic Instantiate");
    }
}
