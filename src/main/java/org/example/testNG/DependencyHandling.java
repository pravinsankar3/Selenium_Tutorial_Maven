    package org.example.testNG;

    import org.testng.annotations.Test;

    public class DependencyHandling {

        @Test(enabled = true)
        public void highSchool()
        {
            System.out.println("High school");
        }

// 1. this TC is dependent on previous TC:
        @Test(dependsOnMethods = "highSchool")
        public void higherSecondary()
        {
            System.out.println("Higher Secondary");
        }

// 2. this TC is dependent on previous TC:
        @Test(dependsOnMethods = "higherSecondary")
        public void College()
        {
            System.out.println("College");
        }
    }
