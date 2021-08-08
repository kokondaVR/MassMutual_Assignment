package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions (
	features = {"src/main/java/features/"},
	glue = {"step_definitions"},
	monochrome = true,
	dryRun = false,
	tags = {},	//no tags means all features and scenarios run
	strict = false,
	plugin = 
			{
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json",
				"junit:target/cucumber.xml",
				"rerun:target/rerun.txt",	//Useful to rerun failed cases
				"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"	//Plugin for auto generating extent report
			}
)

public class Runner_Excercise1 extends AbstractTestNGCucumberTests {}