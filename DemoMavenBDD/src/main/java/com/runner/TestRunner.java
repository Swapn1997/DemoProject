package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/com/features",
		glue="com.stepdef",
		plugin="html:target",
		monochrome =true //for redable data on console
		
		)



public class TestRunner {

}
