package com.mmall.concurrency.example.atomic;

import lombok.Getter;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.*;

public class AtomicTest {
    @Getter
    private volatile long adder = 0;
    static AtomicLongFieldUpdater fieldUpdater = AtomicLongFieldUpdater.newUpdater(AtomicTest.class, "adder");

    public static void main(String[] args) {

        AtomicTest atomicTest = new AtomicTest();

        if (fieldUpdater.compareAndSet(atomicTest, 0, 4)) {
            System.out.println(atomicTest.getAdder());
        }


    }
}
