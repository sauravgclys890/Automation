package com.automation.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetailsPage extends Page {
	
	private final WebDriver driver;
	
	@FindBy(name = "username")
	private WebElement username;

	public UserDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public static UserDetailsPage init(WebDriver driver) {
		return new UserDetailsPage(driver);
	}
	
	public UserDetailsPage launch() {
		driver.get("");
		return this;
	}

	@Override
	public boolean isAt() {
		return this.username.isDisplayed();
	}
	
	

}
