package harveynorman.test.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
		////harveynorman.cucumber/src/test/java/harveynorman/test/steps/LoginSteps.java
		features = {"src/test/java/harveynorman/test/featureFiles/"},
		glue = {"harveynorman.test.steps"},
		monochrome = true,
		tags = {},
		plugin = {"pretty", "html:target/cucumber","json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)

public class MainRunner {
}
