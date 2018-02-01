package org.fasttrackit.search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSearchTest06 {
    @Test
    public void search () {
        System.setProperty("webdriver.chrome.driver",
                "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fasttrackit.org/selenium-test");
        driver.findElement(By.id("search")).sendKeys("cardigan" + Keys.ENTER);

        String oldPrice = driver.findElement(By.xpath("//p[@class='old-price']//span[@class='price']")).getText();
        String specialPrice = driver.findElement(By.xpath("//p[@class='special-price']//span[@class='price'")).getText();

    }

    }

