package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.LoginClass;
import util.BrowserFactory;

public class TestCase {
	
	
	@Test
	public void WordPressLogin() {
		
		WebDriver driver= BrowserFactory.startBrowser();
		LoginClass logintowebsite = PageFactory.initElements(driver, LoginClass.class);
		logintowebsite.login();
		
		
		
		 driver.close(); 
		 driver.quit();
		 
		
		
	}
}
