package com.testRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseClass.Base_Class2;
import com.helpers.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\test\\java\\com\\adactinfea\\Adactin.feature",
		glue = "com.stepDefinition",
		tags = ("~@ad5"),
		monochrome = true ,
		dryRun = false ,
		strict = true ,
		plugin = {"html:cucumberReport/htmlReport",
				  "json:jsonReport/cucumber.json",
				  "pretty",
				  "com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent.html"
				
		}
		
		)

public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		String browser = FileReaderManager.getInstanceFrm().getinstanceCR().passBrowser();
		driver=Base_Class2.browserLaunch(browser);

	}
	@AfterClass
	public static void tear_Down() {
		
		driver.close();

	}

}
