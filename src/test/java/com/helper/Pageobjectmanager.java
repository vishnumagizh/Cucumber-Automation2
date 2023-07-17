package com.helper;

import org.openqa.selenium.WebDriver;

import com.stepDefinition.SwagElements;

public class Pageobjectmanager {
	
	public static WebDriver driver;
	private SwagElements swa;
	
	public Pageobjectmanager(WebDriver driver2)
	{
		this.driver=driver2;
	}
	
	public SwagElements getlp() {
		swa= new SwagElements(driver);
		return swa;
	}
}
