package org.example.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sampleFirstTestcase {

    @Test
    public void firstTestcase() {
        System.out.println("1st Testcase");
    }

    @BeforeClass
    public void before() {
        System.out.println("before classes");
    }

    @AfterClass
    public void after() {
        System.out.println("after classes");
    }
}
