package com.stepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.helper.Filereadermanager;
import com.helper.Pageobjectmanager;
import com.runner.runnertest;

import Greens.Cucumber.TBasefunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition extends TBasefunctions  {
	
	public static WebDriver driver= runnertest.driver;
	Pageobjectmanager pom = new Pageobjectmanager(driver);
//	public static WebDriver driver;
	@Given("launch the application")
	public  void launch_the_application() throws IOException {
		
		//System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");

		String siteaddress = Filereadermanager.getInstance().getcrinstance().siteaddress();
		gourl(siteaddress);
	   
	}
//	@When("user enters the email in the email address field")
//	public void user_enters_the_email_in_the_email_address_field() {
//		driver.findElement(By.id("email")).sendKeys("chittu@gmail.com");

//	}
//	@When("user enters the password in the password field")
//	public void user_enters_the_password_in_the_password_field() {
//		driver.findElement(By.name("pass")).sendKeys("chittu@gmaim");
//	}
//	@When("user enters the {string} in the email address field")
//	public void userEntersTheInTheEmailAddressField(String username) {
//		System.out.println(username);
//		driver.findElement(By.name("user-name")).sendKeys(username);	
	//}
	// @When("^user enters the (.+) in the username field$")
	@When("user enters the {string} in the username field")
	public void userEntersTheInTheUsernameField(String username) {
		System.out.println(username);
				
		sendkeys(username,pom.getlp().getUser());
	}
	@When("user enters the {string} in the password field")
	public void userEntersTheInThePasswordField(String password) {
		System.out.println(password);
		sendkeys(password,pom.getlp().getPwd());
	}
	

	@Then("user click on the login button")
	public void user_click_on_the_login_button() {
		pom.getlp().getLogin().click();
	}



}
