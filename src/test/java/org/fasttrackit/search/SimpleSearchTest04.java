package org.fasttrackit.search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSearchTest04 {
    @Test
    public void searchAfter2keywords() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test");
        driver.findElement(By.id("search")).sendKeys("denim" + Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='product-info' and ./descendant::*[text()='DUMBO Boyfriend Jean']]//a[@title='View Details']")).click();
    }
}