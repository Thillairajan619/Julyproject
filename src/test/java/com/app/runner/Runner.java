package com.app.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\THILLAI\\eclipse-workspace\\TestQA\\src\\test\\java\\com\\app\\feature",
glue="com.app.stepdefinition",
dryRun=true,
monochrome=true,
tags="@asMap")

public class Runner {

}
