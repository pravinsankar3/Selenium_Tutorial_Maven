    package org.example.testNG;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.annotations.AfterSuite;
    import org.testng.annotations.BeforeSuite;
    import org.testng.annotations.Test;

    public class TestSuitWriting {

        WebDriver driver;
        long startTime;
        long endTime;
        long totalTime;

        @BeforeSuite
        public void BeforeTestcase()
        {
            startTime = System.currentTimeMillis();
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        @Test
        public void openGoogle()
        {
         driver.get("https://www.google.com/");
         }

        @Test
        public void openBing()
        {
           driver.get("https://www.bing.com");
        }

        @Test
        public void openYahoo()
        {
            driver.get("https://www.yahoo.com/");
        }

        @AfterSuite
        public void AfterTestcase()
        {
            endTime = System.currentTimeMillis();
            totalTime = endTime - startTime;
            System.out.println("Time taken: "+totalTime);
            driver.quit();
        }
    }