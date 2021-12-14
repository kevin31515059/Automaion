package BroswerStack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Objects;

import java.lang.Object;
import graphql.Assert;

import java.util.concurrent.TimeUnit;

public class Selenium {
	
	
	public static void logIn(ChromeDriver driverName){
		
		final String expectedLogInMessage = "Hello, KevinAutomation";
		driverName.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driverName.findElement(By.id("ap_email")).sendKeys("everhappy1990@hotmail.com");
		driverName.findElement(By.id("continue")).click();
		
		driverName.findElement(By.id("ap_password")).sendKeys("123Test123");
		driverName.findElement(By.id("signInSubmit")).click();
		
		String logInName = driverName.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
		
		
		if (Objects.equal(expectedLogInMessage, logInName)==true){
			System.out.println("Login Success");
			Assert.assertTrue(Objects.equal(expectedLogInMessage, logInName));
		}else 
			driverName.close();
		
		//Assert.assertTrue(expectedLogInMessage==logInName);
				
	}
	
	

	public static void main (String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		
		logIn(driver);
		

	}
	
}
