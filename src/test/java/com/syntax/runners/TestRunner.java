package com.syntax.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features/LeaveList.feature"}, glue = {
		"com/syntax/stepDefinitions" }, dryRun = false, tags= {"@LeaveList"})

public class TestRunner {

}
