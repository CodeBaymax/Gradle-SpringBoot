package com.susu.standardE.ClassLoad.subQuoteParentStatic;

public class ParentStatic {
    static {
        System.out.println("Parent Static");
    }
}

class SubParentStatic extends ParentStatic {
    static {
        System.out.println("SubParentStatic Static");
    }

    public static int value = 123;

    public SubParentStatic() {
        System.out.println("SubParentStatic Instantiate");
    }
}
