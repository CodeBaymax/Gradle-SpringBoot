package com.susu.standardE;

public class ThreadSleep {
    public static void main(String[] args) {
        try {
            System.out.println("aaa");
            Thread.sleep(3000);
            System.out.println("bbb");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
