package org.test.Webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebpageTest {
    private static WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        // Selenium 4 automatically handles driver executables—no System.setProperty needed!
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // 🛑 REPLACE THIS URL with your own live GitHub Pages URL you copied in Step 6!
        driver.get("https://antreman.github.io/exp2dev/");
    }

    @Test
    public void titleValidationTest(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Tripillar Solutions";

        // Verifies if your live website title matches exactly
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000); // Leaves browser open for 5 seconds so you can witness it
        if (driver != null) {
            driver.quit();
        }
    }
}