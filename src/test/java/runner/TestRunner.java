package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportConfig;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =".\\src\\test\\resources\\feature",         //classPath:Features",//\src\test\resources\Features
        glue = "step.definition",
        dryRun = false,  
        tags ="@retail",
        monochrome = true, 
        strict = true, 
        plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json"},
        publish = true
        )
public class TestRunner {
	

@AfterClass
    public static void generateReport() {
    CucumberReportConfig.reportConfig();
}

}

         