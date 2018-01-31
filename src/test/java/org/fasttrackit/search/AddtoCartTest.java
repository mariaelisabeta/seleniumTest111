package org.fasttrackit.search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCartTest {

        @Test
        public void addProducttoCart() {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://fasttrackit.org/selenium-test/");
            driver.findElement(By.id("search")).sendKeys("vase" + Keys.ENTER);
            driver.findElement(By.xpath("//div[@class='product-info' and ./descendant::*[text()='Herald Glass Vase']]//button[contains(@class, 'btn-cart')]”)).click();"));

        }}


//errooorrr