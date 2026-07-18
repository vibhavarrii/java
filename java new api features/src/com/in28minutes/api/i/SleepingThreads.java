package com.in28minutes.api.i;

import java.util.concurrent.TimeUnit;

public  class SleepingThreads implements Runnable {
        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }