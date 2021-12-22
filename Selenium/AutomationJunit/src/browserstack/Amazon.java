package browserstack;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.junit.Before;
import java.util.List;

//import graphql.Assert;

import org.junit.Test;



public class Amazon {
	

	//final String login_email = readfile.userName;
	//final String login_password = readfile.password;
	public static ChromeDriver driver;
	
	
	@Before
	public void setUpChromeDriver(){
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");

	}
	
	
/*	@Test
	public void logIn() throws InterruptedException{
		ReadFile readfile = new ReadFile(); 
		String login_email = readfile.readUserName();
		String login_password = readfile.readPassword();
		
		final String expectedLogInMessage = "Hello, KevinAutomation";
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys(login_email);
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys(login_password);
		driver.findElement(By.id("signInSubmit")).click();
		
		String logInName = driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
		

		Assert.assertEquals(expectedLogInMessage, logInName);
				
	}*/
	
	@Test
	public void searchItems() throws InterruptedException{
		
		String searchItem = "chair";
		Helper.searchItem(driver, searchItem);
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem);
	
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		//System.out.println(driver.getCurrentUrl().contains(searchItem));
		
		Assert.assertTrue(driver.getCurrentUrl().contains(searchItem));
		
	}
	
	
	/*@Test
	public void searchLinkTextItems(){
		String chairName = "Gaming Chair Racing Office Chair High Back Computer Desk Chair PU Leather Chair Executive and Ergonomic Swivel Chair with Headrest and Lumbar Support (Red)";
		String searchItem = "chair";

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem);
	
		driver.findElement(By.id("nav-search-submit-button")).click();

		driver.findElement(By.linkText(chairName)).click();
		Assert.assertEquals(chairName, driver.findElement(By.id("productTitle")).getText());
	} */
	
/*	@Test
	public void serachItemList(){
		String searchItem = "chair";
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem);
	
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.manage().window().maximize();
		
		//Search only contain cel_widget_id*='MAIN-SEARCH_RESULTS' but not cel_widget_id*='MAIN-FEATURED_ASINS_LIST'
		//Using *= to indicate the attribute contains certain value
		List<WebElement> listElement = driver.findElements(By.cssSelector(".s-result-item div[cel_widget_id*='MAIN-SEARCH_RESULTS']:not([cel_widget_id*='MAIN-FEATURED_ASINS_LIST'])"));
		System.out.println(listElement.size());
		for(int i =0; i<listElement.size();i++){

			String text = listElement.get(i).getText().toLowerCase();
			//System.out.println("Item"+i+" "+text);
			if(text.contains(searchItem)){
				//System.out.println("true"+i+" "+text);
				continue;
				
			} else{
				//System.out.println("false"+i+" "+text);
				Assert.assertTrue(false);
			}
			//System.out.println("Text: "+text);
			
		}
		Assert.assertTrue(true);
		
	}*/

	
	@After
	public void closeDriver(){
		
		driver.close();
		
	}
}
