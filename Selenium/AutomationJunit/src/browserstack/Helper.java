package browserstack;

import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {

	public static void maximizeWindow(ChromeDriver driver){
		
		driver.manage().window().maximize();
		
	}
	
	
}
