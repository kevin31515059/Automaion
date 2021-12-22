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
}
