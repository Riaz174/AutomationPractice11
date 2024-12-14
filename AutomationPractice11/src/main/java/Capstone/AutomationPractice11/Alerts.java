package Capstone.AutomationPractice11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice11\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		/*WebElement alerts = driver.findElement(By.id("alertButton"));
		alerts.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		Thread.sleep(30000);
		WebElement confirm = driver.findElement(By.id("confirmButton"));
		confirm.click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement prombox = driver.findElement(By.id("promtButton"));
		prombox.click();
		driver.switchTo().alert().sendKeys("Hello!,Copilot");
		Thread.sleep(3000);*/
		//driver.switchTo().alert().accept();

	}

}
