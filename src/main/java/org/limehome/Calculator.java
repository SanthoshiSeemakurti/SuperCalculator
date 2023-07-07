package org.limehome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

                driver.get("http://juliemr.github.io/protractor-demo");

        WebElement op1 = driver.findElement(By.xpath("//form[@class='form-inline ng-pristine ng-valid']/input"));

        WebElement op2 = driver.findElement(By.xpath("//form[@class='form-inline ng-pristine ng-valid']/input[2]"));

                op1.sendKeys("10");
                op2.sendKeys("5");

        WebElement goButton = driver.findElement(By.id("gobutton"));
                goButton.click();



    }
}
