package luma.usa.myRunnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
	(
	 plugin = {"pretty","json:target/cucumber.json" },
	 features= { ".//Features/"},//features=feature file location where we write automation T/C
     glue = { "luma.usa.stepDefinition","luma.usa.hooks"}//step definition location where we implement T/C

	)
	public class MyRunner extends AbstractTestNGCucumberTests{

}
