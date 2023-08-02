package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featuresFile", glue = "stepDefination", dryRun = false, tags = "@DataParamaterization", monochrome = true, plugin = {
		"pretty", "html:target/cucumber.html" ,"junit:target/cucumber.xml","json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
