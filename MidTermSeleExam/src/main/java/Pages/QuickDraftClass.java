package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QuickDraftClass extends BasePage {
	WebDriver driver;

	public QuickDraftClass(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "title")
	WebElement Title;
	@FindBy(how = How.ID, using = "content")
	WebElement Content;
	@FindBy(how = How.ID, using = "save-post")
	WebElement Save;
	@FindBy(how = How.XPATH, using = "//a[text()='PageObject Midterm Exam']")
	WebElement ValidDraft;

	public void CreatQuickDraft() {

		Title.sendKeys("PageObject Midterm Exam");
		Content.sendKeys("Hope its done");
		Save.click();
	}

	public void WaitForPage() {
		waitForElement(ValidDraft, driver);
	}

	public boolean isMyDraftDisplayed() {
		WaitForPage();
		if (ValidDraft.isDisplayed()) {

			System.out.println("Draft Validated");
		} else {
			System.out.println("Draft not Vlidated");
		}

		return true;

	}
}
