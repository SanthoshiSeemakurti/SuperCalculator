package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@CucumberOptions( features = "src/test/resources/CalculatorTest.feature",
        glue = {"StepDefinition"},
        tags = "@calc",
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"},
        plugin = {"json:target/cucumber-reports/CucumberTestReport.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        //Publish = true,
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel =true)
    public Object[][] features() {
        return super.features();
    }
}