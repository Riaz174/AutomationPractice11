package Capstone.AutomationPractice11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice11\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement sign = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		sign.click();
		Thread.sleep(6000);
		WebElement emailF = driver.findElement(By.name("email"));
		emailF.sendKeys("john@gmail.com");
		Thread.sleep(10000);
		WebElement cbutton = driver.findElement(By.id("continue"));
		cbutton.click();
		Thread.sleep(6000);
		driver.close();

	}

}
