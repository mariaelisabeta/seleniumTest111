package org.fasttrackit.search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSearchTest02 {
    @Test
    public void simpleSearchAfter1keywordd() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.id("search")).sendKeys("Alice" + Keys.ENTER);
    }
}

