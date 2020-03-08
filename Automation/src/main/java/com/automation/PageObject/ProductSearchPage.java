package com.automation.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchPage extends Page{

	public ProductSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public static ProductSearchPage init(WebDriver driver) {
		return new ProductSearchPage(driver);
	}
	@Override
	public boolean isAt() {
		return isAt(10, TimeUnit.SECONDS);
	}

}
