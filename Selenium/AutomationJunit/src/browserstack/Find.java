package browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Find {

	static WebDriverWait wait;
	static WebElement element;


	public static void ByID(ChromeDriver driver, String id){
		
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		//driver.findElement(By.id(id)).click();
		element = driver.findElement(By.id(id));
		
	}
	public static void ByCssSelector(ChromeDriver driver, String cssPath){
		
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssPath)));
		//driver.findElement(By.cssSelector(cssPath)).click();
		element = driver.findElement(By.cssSelector(cssPath));
	}
	public static void ByClass(ChromeDriver driver, String className){
		
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
		//driver.findElement(By.className(className)).click();
		element = driver.findElement(By.className(className));
	}
	public static void ByXpath(ChromeDriver driver, String xpath){
		
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		//driver.findElement(By.xpath(xpath)).click();
		element = driver.findElement(By.xpath(xpath));
	}
	public static void ByLinkText(ChromeDriver driver, String text){
		
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(text)));
		element = driver.findElement(By.linkText(text));
	}
}
