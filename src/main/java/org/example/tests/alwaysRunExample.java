package org.example.tests;

import org.testng.annotations.Test;

public class alwaysRunExample {

    @Test(timeOut = 2000)
    public void parentsPermission() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("--permission granted--");
    }

    @Test(dependsOnMethods = "parentsPermission", alwaysRun = true)
    public void marriage() {
        System.out.println("--Marriage done--");
    }
}