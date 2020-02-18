package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Pages.PostMenu;
import Pages.QuickDraftClass;
import util.BrowserFactory;

public class MakeQuickDraft {

	@Test
	public void MakeQuickDraft() {

		WebDriver driver = BrowserFactory.startBrowser();
		Pages.LoginClass logintowebsite = PageFactory.initElements(driver, Pages.LoginClass.class);

		logintowebsite.login();

		String expectedTitle = "Dashboard ‹ opensourcecms — WordPress";
		String actuelTitle = logintowebsite.getPageTitle();
		Assert.assertEquals(expectedTitle, actuelTitle);

		QuickDraftClass Draft = PageFactory.initElements(driver, QuickDraftClass.class);
		Draft.CreatQuickDraft();
		Draft.isMyDraftDisplayed();

		PostMenu Post = PageFactory.initElements(driver, PostMenu.class);
		Post.AllPostsClick();
		Post.isPostDisplayed();

		driver.close();
		driver.quit();

	}
}
