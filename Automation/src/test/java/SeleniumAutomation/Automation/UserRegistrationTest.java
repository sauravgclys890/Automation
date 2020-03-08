package SeleniumAutomation.Automation;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.PageObject.UserDetailsPage;
import com.automation.drivermanager.DriverManager;

public class UserRegistrationTest {
	
	private WebDriver driver;
	private UserDetailsPage userDetailsPage;
	//private ProductSearchPage productSearchPage;
	//private OrderSummaryPage orderSummaryPage;
	//private OrderConfirmationPage orderConfirmationPage;
	
	@BeforeTest
	public void setUpDriver() {
		driver= DriverManager.getChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void launch() {
		userDetailsPage=UserDetailsPage.init(driver).launch();
		
		//validate if the page is loaded
		Assert.assertTrue(userDetailsPage.isAt());
	}
	
	
	

}
