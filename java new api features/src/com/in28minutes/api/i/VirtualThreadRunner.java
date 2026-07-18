package com.in28minutes.api.i;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VirtualThreadRunner {

    public static void main(String[] args) {
    	ExecutorService  executor = Executors.newVirtualThreadPerTaskExecutor();
    	//can create unlimited number of threads
        for (int i = 0; i < 1_000_000; i++) {
        	System.out.println(i);
//            new Thread(new SleepingThreads()).start();
//        	Thread.startVirtualThread(new SleepingThreads());
//        	Thread.ofVirtual().start(new SleepingThreads());
        	executor.execute(new SleepingThreads());
        }
    }
}
