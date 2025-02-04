package org.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify {

    @Test
    public void Assert() {

// Hard Assertion
        System.out.println("Before Assertion");
        Assert.fail(); //Assert.assertEquals(true, false);
        System.out.println("After Assertion");

//Soft Assertion:
        System.out.println("Before Assertion");
        SoftAssert assert1 = new SoftAssert();
        assert1.fail();
        System.out.println("After Assertion");
    }
}
