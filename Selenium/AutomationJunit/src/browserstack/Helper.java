package browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {

	public static void maximizeWindow(ChromeDriver driver){
		
		driver.manage().window().maximize();
		
	}
	
	public static void searchItem(ChromeDriver driver, String itemName){
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(itemName);
	
		driver.findElement(By.id("nav-search-submit-button")).click();

	}
	
	
	public static void viewListItem(ChromeDriver driver, String ListItem){
		
		driver.findElement(By.linkText(ListItem)).click();
	}
	
	public static void addToCart(ChromeDriver driver){
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
	}
	
	
	public static void viewCart(ChromeDriver driver){
		
		driver.findElement(By.id("nav-cart-count")).click();
		
		
	}
	
	public static void closeSlide(ChromeDriver driver){
		
		driver.findElement(By.id("attach-close_sideSheet-link")).click();
		
	}
	
	public static void deleteItem(ChromeDriver driver, String removeItem){
	//public static void deleteItem(ChromeDriver driver){	
		//driver.findElement(By.xpath("//span[contains(text(),removeItem)]"))
		//driver.findElement(By.xpath("//span[contains(@class,'sc-action-delete')]//input")).click();
		driver.findElement(By.xpath("//span[contains(text(), removeItem)]/../../../../../../..//span[contains(@class,'sc-action-delete')]//input")).click();
	}
	
	
}
