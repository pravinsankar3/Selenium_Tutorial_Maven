package org.example.tests;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TimeoutExample {

    @Test(timeOut = 1000, expectedExceptions = ThreadTimeoutException.class)
    public void test() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("agni");
    }
}