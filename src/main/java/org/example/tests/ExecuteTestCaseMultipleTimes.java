package org.example.tests;

import org.testng.annotations.Test;

public class ExecuteTestCaseMultipleTimes {

    @Test(invocationCount = 3)
    public void test() {
        System.out.println("agni");
    }
}