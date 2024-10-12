package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features/LoginSales.feature",glue="stepdefenition")
public class LoginSalesRunner extends AbstractTestNGCucumberTests{

}
