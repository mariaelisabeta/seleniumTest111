//fiecare test va fi o metoda publica
//va fi void ca testul nu va returna nimic, ci doar va face niste actiuni si atat
// "\" tine loc de ghilimele intre ghilimele. escape character
//in pagina click dreapta - inspect. a- ancore e tagul pentru linkuri
//un tag, atribute- keye+valoare
//cand faci un proiect nou trebuie sa google:selenium java maven + copy la dependency       + updatarea ultimei versiuni de junit [modificarea in ceea ce e scris deja cu ce gasesti pe ggle.
//2. java org.fasttractit new class

package org.fasttrackit.search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSearchTest {

    //transformam metoda intr un test: deasupra metodei punem o adnotare adica @
    @Test
    public void SimpleSearchWithOneKeyWord(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\drivers\\chromedriver.exe"); // copy paste erorii pe care am primit o si pasii de pe primul link
        WebDriver driver = new ChromeDriver();
        //deschiderea unei pagini web
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.id("search")).sendKeys("vase" + Keys.ENTER);
        //by. classname- una dintre clase. nu o sa poti si button si search button, ci doar una[din inspect din site]
        //by. linktext - inspect pe add to wishlist- si copiez doar Add to Wishlist, adica textul, nu linkul
        //by. partiallinktext putem da o portiune din acel text: add to wish- iddentifica corect
        //by. name - input, button, orice
        //preferam id, name, classname, linktext. trb sa cautam atributul care e cel mai putin probabil sa fie schimbat in viitor.

}}

