package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions (
	features = {"src/main/java/features/"},
	glue = {"step_files"},
	monochrome = true,
	dryRun = false,
	tags = {},
	strict = false,
	plugin = 
			{
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json",
				"junit:target/cucumber.xml",
				"rerun:target/rerun.txt",
				"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"	//plugin for auto generating extent report
			}
)

public class Runner_Dashboard extends AbstractTestNGCucumberTests {}