package com.susu.standardE.stringDemo;

public class StringReplace {

    public static void main(String[] args) {
        String str = "x/1.6";

        System.out.println(str.replaceAll("(?i)x", "200"));
    }
}
