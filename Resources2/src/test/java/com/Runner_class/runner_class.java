package com.Runner_class;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Resources.Base_class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\Feature_Files",

		glue = "com.Step_Definitions",

		monochrome = true, dryRun = false, strict = true,

		plugin = { "html:Report/HtmlReport", 
				"pretty", 
				"json:JansonReport/Report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html"

		},

		tags = { "@publish" }

)




public class runner_class {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {
		driver = Base_class.get_Driver("chrome");
	}

	@AfterClass
	public static void tear_Down() {
		// driver.close();
}
}