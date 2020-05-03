package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src\\main\\java\\testFeature\\Featurefile.feature", glue = "stepDefinition\\LoginpageSteps",
		//"stepDefinition\\LoginpageSteps",
		plugin= {"html:target/cucumber-html-report"},
		dryRun=false
		
)


public class TestRunner
{
	

}
