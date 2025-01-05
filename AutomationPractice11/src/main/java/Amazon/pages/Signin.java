package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	public WebDriver driver;
	@FindBy(id = "email") WebElement email;
	@FindBy(id = "pass") WebElement pword;
	public Signin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void emailField() {
		email.sendKeys("John@gmail.com");
	}
	public void ContinueClick() {
		pword.sendKeys("abcdef");
		
		
	}

}
