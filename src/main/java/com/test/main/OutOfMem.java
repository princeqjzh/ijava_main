package com.test.main;

import java.util.ArrayList;
import java.util.List;

public class OutOfMem {
    public static void main(String[] args) throws InterruptedException {
        // vm args: -Xms2m -Xmx2m -> Heap Out of Memory
        int count = 0;
        int gc_count = 0;
        List list = new ArrayList();
        while(count < 50000){
            list.add(new Object());
            System.out.println("Count = " + ++count);
            gc_count++;
            if(gc_count >= 10000){
                System.gc();
                gc_count = 0;
            }
            Thread.sleep(500);
        }
    }
}
