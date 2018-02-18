package flipkart.testCases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import flipkart.pageObjects.LoginPage;

public class TestClass
{
	WebDriver driver ;
	public LoginPage loginpage;
	
	public TestClass()
	{
		loginpage = new LoginPage();
		driver = loginpage.driver;
		
	}
	
	@Test
	public void loginTest() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https://www.paytm.com/");
		loginpage.login();
	}
}
