package org.fasttrackit.search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSearchTest01 {
    @Test
    public void SimpleSearchWithOneKeyWord() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\drivers\\chromedriver.exe"); // copy paste erorii pe care am primit o si pasii de pe primul link
        WebDriver driver = new ChromeDriver();
        //deschiderea unei pagini web
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.id("search")).sendKeys("cardigan" + Keys.ENTER);
}}
