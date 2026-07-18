package com.in28minutes.api.i;

import java.util.concurrent.TimeUnit;

public class ExecutorServiceVirtualThreadRunner {

    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000; i++) {
        	System.out.println(i);
//            new Thread(new SleepingThreads()).start();
        	Thread.startVirtualThread(new SleepingThreads());
        	Thread.ofVirtual().start(new SleepingThreads());
        }
    }
}
