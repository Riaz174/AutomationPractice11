package Capstone.AutomationPractice11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutes {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice11\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		WebElement sbutton = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
		sbutton.click();
		Thread.sleep(10000);
//		WebElement all = driver.findElement(By.linkText("All"));
//		all.click();
//		Thread.sleep(6000);
//		WebElement tdeals = driver.findElement(By.linkText("Today's Deals"));
//		tdeals.click();
//		Thread.sleep(6000);
//		WebElement cservices = driver.findElement(By.linkText("Customer Service"));
//		cservices.click();
//		Thread.sleep(6000);
//		WebElement reg = driver.findElement(By.linkText("Registry"));
//		reg.click();
//		Thread.sleep(6000);
		WebElement gcards = driver.findElement(By.linkText("Gift Cards"));
		gcards.click();
		Thread.sleep(6000);
		WebElement cart = driver.findElement(By.id("nav-cart-count"));
		cart.click();
		Thread.sleep(6000);
		
		

	}

}
