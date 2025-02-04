package org.example.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {

    String name = "agni";
    Boolean value = false;

    @Test
    public void checkEqual() {
        /*if (name.equals("agni")) {
            System.out.println("Name is equal");
        } else {
            System.out.println("Name is not equal");
        }*/

        Assert.assertEquals(name, "agni");
        Assert.assertNotEquals(name, "Agni");
        Assert.assertTrue(value, "This should not be true");
    }
}