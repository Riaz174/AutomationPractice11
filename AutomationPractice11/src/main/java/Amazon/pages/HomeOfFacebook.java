package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import groovy.transform.Field;

public class HomeOfFacebook {
	public WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Facebook helps you connect and share with the people in your life.')]") WebElement text;
	@FindBy(id = "email") WebElement emailField;
	@FindBy(id = "pass") WebElement pword;
	@FindBy(name = "login") WebElement logbutton;
	public HomeOfFacebook(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String verifictionOfText() {
		String tx =text.getText();
		return tx;
	}
	public void email(String id) {
		emailField.sendKeys(id);
	}
	public void pwordF(String id) {
		pword.sendKeys(id);
	}
	public void logClick() {
		logbutton.click();
		
	}

}
