package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginClass extends BasePage{
	
	
	WebDriver driver;
	public LoginClass(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	@FindBy(how=How.ID, using="user_login")
	WebElement UserName;
	
	@FindBy(how=How.ID, using="user_pass")
	WebElement Password;
	@FindBy(how=How.ID, using="wp-submit")
	WebElement SigninButton;
	
	public void login() {
		
	UserName.sendKeys("opensourcecms");
	Password.sendKeys("opensourcecms");
	SigninButton.click();
	
	}

	
	 public String getPageTitle() {
	  
	 return driver.getTitle(); }
	 
}
