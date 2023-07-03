package com.test.main;

public class Sample {
    public static void main(String[] args) throws InterruptedException {
        //Print out GC
        int polling = 2;
        System.out.println("This is a sample of java main class!!!!!");
        System.out.println("Waiting " + polling + " sec.");
        Thread.sleep(polling * 1000);
        System.out.println("Run GC");
        System.gc();
    }
}
