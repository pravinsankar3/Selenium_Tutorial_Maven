package org.example.testNG;

import org.testng.annotations.Test;

public class Skip {

    @Test(priority = 0)
    public void startCar()
    {
        System.out.println("Start the car");
    }

// 1. Skipping a test case:

    @Test(priority = 5, enabled = false)
    public void skipATestcase(){
        System.out.println("Turn on the Music");
    }

    @Test(priority = 1)
    public void firstGear()
    {
        System.out.println("1st gear");
    }

    @Test(priority = 2)
    public void SecondGear()
    {
        System.out.println("2nd gear");
    }

    @Test(priority = 3)
    public void thirdGear()
    {
        System.out.println("3rd gear");
    }

    @Test(priority = 4)
    public void fourthGear()
    {
        System.out.println("4th gear");
    }
}
