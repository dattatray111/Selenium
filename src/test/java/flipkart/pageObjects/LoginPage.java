package flipkart.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import flipkart.testCases.TestClass;

public class LoginPage
{
	public static WebDriver driver = new FirefoxDriver();
	
	public void login() throws InterruptedException
	{
			Thread.sleep(1000);
		driver.findElement(By.xpath("//div[3]/div[3]/div")).click();
		Thread.sleep(2000);
		WebElement popup = driver.findElement(By.id("main-container"));
		popup.findElement(By.id("input_0")).sendKeys("dtta@mail.com");
		popup.findElement(By.xpath(".//*[@id='input_1']")).sendKeys("12345");
		popup.findElement(By.xpath(".//button[@type='submit']")).click();
		/*String errormsg = driver.findElement(By.id("ch_login_password_error")).getText();
		System.out.println(errormsg);*/
		
	}
}


