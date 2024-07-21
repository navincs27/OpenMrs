package com.NykaaCucumber9AM.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\java\\com\\NykaaCucumber9AM\\feature\\Nykaa.feature",
						glue = "com.NykaaCucumber9AM.stepDef", tags = "@SmokeTest",
						plugin = {"pretty","html:target/cucumberreports"},
						dryRun = true)
public class Runner {
	
	

}
