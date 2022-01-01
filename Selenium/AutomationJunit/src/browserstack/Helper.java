package browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {

	static double sum=0;
	static WebDriverWait wait;
	public static void maximizeWindow(ChromeDriver driver){
		
		driver.manage().window().maximize();
		
	}
	
	public static void searchItem(ChromeDriver driver, String itemName){
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(itemName);
		Find.ByID(driver, "twotabsearchtextbox");
		Find.element.sendKeys(itemName);

		//driver.findElement(By.id("nav-search-submit-button")).click();
		Click.ByID(driver, "nav-search-submit-button");
	}
	
	
	public static void viewListItem(ChromeDriver driver, String ListItem){
		
		//driver.findElement(By.linkText(ListItem)).click();
		Click.ByLinkText(driver, ListItem);
	}
	
	public static void addToCart(ChromeDriver driver){
		final String cartButton = "add-to-cart-button";
		//driver.findElement(By.id("add-to-cart-button")).click();
		Click.ByID(driver, cartButton);
		
	}
	
	
	public static void viewCart(ChromeDriver driver){
		
		//driver.findElement(By.id("nav-cart-count")).click();
		Click.ByID(driver, "nav-cart-count");
		
	}
	
	public static void closeSlide(ChromeDriver driver){
		
		//driver.findElement(By.id("attach-close_sideSheet-link")).click();
		Click.ByID(driver, "attach-close_sideSheet-link");
	}
	
	public static void deleteItem(ChromeDriver driver, String removeItem){
	String SearchxPath = String.format("//span[text()= '%s']/ancestor::div[@class='a-row sc-action-links']/span[@class='a-size-small sc-action-delete']//input", removeItem);	

		//driver.findElement(By.xpath("//span[contains(text(), removeItem)]/../../../../../../..//span[contains(@class,'sc-action-delete')]//input")).click();
		Click.ByXpath(driver, SearchxPath);
		
	}
	
	public static void wait(int millisecond){
		
		try {
			Thread.sleep(millisecond);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void GoToHomePage(ChromeDriver driver){
		
		Click.ByID(driver, "nav-logo");
		
	}
	
	public static double GetPrice(ChromeDriver driver){
		wait = new WebDriverWait(driver,30);
		double price = 0;
		//System.out.println("In GetPrice");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#corePrice_feature_div .a-offscreen")));
		String text = driver.findElement(By.cssSelector("#corePrice_feature_div .a-offscreen")).getAttribute("innerText");
		text = text.replaceAll("[$,]", "");
		//Find.ByCssSelector(driver, "#corePrice_feature_div .a-section .a-text-price .a-offscreen");
		price = Double.parseDouble(text);
		//System.out.println("Price: "+price);
		return price;

	}
	
	public static double GetSubtotal(ChromeDriver driver){
		double subtotal = 0;
		//System.out.println("In GetSubtotal");
		String text = driver.findElement(By.cssSelector("#sc-subtotal-amount-buybox .sc-price")).getAttribute("innerText");
		text = text.replaceAll("[$,]", "");

		subtotal = Double.parseDouble(text);

		return subtotal;

	}
	
	public static double GetSum(double price){

		sum = sum + price;
		//System.out.println("Sum: "+sum);
		return sum;
	}
	
	public static void CurrentSum(){
		
		System.out.println("Current Sum: "+sum);
		
	}
}
