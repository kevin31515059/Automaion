package browserstack;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetText{


	
	public static String ByID(ChromeDriver driver, String id){
		
		Find.ByID(driver, id);
		return Find.element.getText();

	}
	
	public static String ByCssSelector(ChromeDriver driver, String cssPath){
		
		Find.ByCssSelector(driver, cssPath);
		//return Find.element.getText();
		return Find.element.getAttribute("innerText");
	}

	public static String ByClass(ChromeDriver driver, String className){
		
		Find.ByClass(driver, className);
		return Find.element.getText();

	}
	public static String ByXpath(ChromeDriver driver, String xpath){
		
		Find.ByXpath(driver, xpath);
		return Find.element.getText();

	}
	public static String ByLinkText(ChromeDriver driver, String text){
		
		Find.ByLinkText(driver, text);
		return Find.element.getText();

	}
	
}
