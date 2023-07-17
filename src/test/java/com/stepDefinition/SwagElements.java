package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagElements {

	
			
			@FindBy(id = "user-name")private WebElement user;
			
			@FindBy(id = "password")private WebElement pwd;
			
			@FindBy(id = "login-button")private WebElement login;
			
		    
		    
		    public SwagElements(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
//Getters



			public WebElement getUser() {
				return user;
			}



			public WebElement getPwd() {
				return pwd;
			}



			public WebElement getLogin() {
				return login;
			}
		    
		    

	

}
