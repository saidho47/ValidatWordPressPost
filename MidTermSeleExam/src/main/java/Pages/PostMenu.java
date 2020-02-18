package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostMenu extends BasePage {

	WebDriver driver;

	public PostMenu(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[text()='Posts']")
	WebElement Post;
	@FindBy(how = How.XPATH, using = "//a[text()='All Posts']")
	WebElement AllPosts;

	@FindBy(how = How.XPATH, using = "//a[text()='PageObject Midterm Exam']")
	WebElement MyPost;

	public void AllPostsClick() {

		Post.click();
		AllPosts.click();

	}

	public void WaitForPost() {
		waitForElement(MyPost, driver);
	}

	public boolean isPostDisplayed() {
		WaitForPost();
		if(MyPost.isDisplayed()) {
			System.out.println("Post Validated");
		} else {
			System.out.println("Post Not Validated");
		};
		return true;
	}
}