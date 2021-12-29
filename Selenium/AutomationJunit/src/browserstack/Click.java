package browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click extends Find{

	public static void ByID(ChromeDriver driver, String id){
		
		Find.ByID(driver, id);
		Find.element.click();

	}
	
	public static void ByCssSelector(ChromeDriver driver, String cssPath){
		
		Find.ByCssSelector(driver, cssPath);
		Find.element.click();

	}

	public static void ByClass(ChromeDriver driver, String className){
		
		Find.ByClass(driver, className);
		Find.element.click();

	}
	public static void ByXpath(ChromeDriver driver, String xpath){
		
		Find.ByXpath(driver, xpath);
		Find.element.click();

	}
	public static void ByLinkText(ChromeDriver driver, String text){
		
		Find.ByLinkText(driver, text);
		Find.element.click();

	}
}
