package org.limehome;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    private WebDriver driver;

    @Before
    public void setup(){
        driver=new ChromeDriver();
    }
    @After
    public void tearDown(){
        if (driver!=null){
            driver.quit();
        }
    }

    //Page locators
    private By operand1InputLocator = By.xpath("//form[@class='form-inline ng-pristine ng-valid']/input");
    private By operand2InputLocator = By.xpath("//form[@class='form-inline ng-pristine ng-valid']/input[2]");
    private By addOperatorButton = By.xpath("//option[@value='ADDITION']");
    private By divisionOperatorButton = By.xpath("//option[@value='DIVISION']");
    private By moduloOperatorButton = By.xpath("//option[@value='MODULO']");
    private By multiplicationOperatorButton = By.xpath("//option[@value='MULTIPLICATION']");
    private By subtractionOperatorButton = By.xpath(" //option[@value='SUBTRACTION']");
    private By operatorExpandButton= By.xpath(" //select[@class='span1 ng-valid ng-touched ng-dirty ng-valid-parse']");
    private By goButton= By.id("gobutton");
    private By resultTab =By.cssSelector("h2[class='ng-binding']");
    //constructor
    public BasePage(WebDriver driver) {
        this.driver= driver;
    }

    //Page actions
    public void launchCalculatorPage() {
        driver.get("http://juliemr.github.io/protractor-demo/");
        // launchCalculator = new LaunchCalculator(driver);
    }

    public void enterOperand1() {
        WebElement operand1Input = driver.findElement(operand1InputLocator);
        operand1Input.sendKeys("20");
    }
    public void enterOperand2() {
        WebElement operand2Input = driver.findElement(operand2InputLocator);
        operand2Input.sendKeys("10");
    }

    public void selectAddOperator() {

        WebElement operatorSelector = driver.findElement(operatorExpandButton);
        WebElement addOperator = driver.findElement(addOperatorButton);
        addOperator.click();
    }

    public void selectDivisionOperator() {

        WebElement operatorSelector = driver.findElement(operatorExpandButton);
        WebElement divisionOperator = driver.findElement(divisionOperatorButton);
        divisionOperator.click();
    }

    public void selectMultiplicationOperator() {
        WebElement operatorSelector = driver.findElement(operatorExpandButton);
        WebElement multiplicationOperator = driver.findElement(multiplicationOperatorButton);
        multiplicationOperator.click();
    }

    public void selectModuloOperator() {
        WebElement operatorSelector = driver.findElement(operatorExpandButton);
        WebElement moduloOperator = driver.findElement(moduloOperatorButton);
        moduloOperator.click();
    }

    public void selectSubtractionOperator() {
        WebElement operatorSelector = driver.findElement(operatorExpandButton);
        WebElement subtractionOperator = driver.findElement(subtractionOperatorButton);
        subtractionOperator.click();
    }
    public void clickGoButton() {
        WebElement goButtonClick = driver.findElement(goButton);
        goButtonClick.click();

    }
    public WebElement result(double result) {
        WebElement resultCalc = driver.findElement(resultTab);
        return(resultCalc);
    }
}