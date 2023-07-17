package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.helper.Filereadermanager;

import Greens.Cucumber.TBasefunctions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/com/featureFile"
		,glue="com/stepDefinition",
		monochrome=true,
		stepNotifications = true,
		dryRun = !true,
		snippets = SnippetType.CAMELCASE,
		//publish=true
		plugin=//"pretty"
				//"usage"
				//"html:target/cucumber-report/facebook.html"
		//"json:target/cucumber-report/facebook.json"
		//"junit:target/cucumber-report/facebook.xml"
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		)


public class runnertest extends TBasefunctions {
	public static WebDriver driver;
	@BeforeClass
	public static void launch() throws IOException {
		String browsername = Filereadermanager.getInstance().getcrinstance().browsername();
		driver=TBasefunctions.browserlauncher(browsername);

	}
	@AfterClass
	public static void teardown()
	{
		driver.quit();
	}

}
