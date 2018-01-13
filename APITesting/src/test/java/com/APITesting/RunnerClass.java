package com.APITesting;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



	@RunWith(Cucumber.class)
	@CucumberOptions (features = "C:\\Chandrakant\\APITesting\\data.feature",
	glue = {"stepDefinition"})
	public class RunnerClass {
	}



