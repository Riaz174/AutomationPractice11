package Capstone.AutomationPractice11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice11\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement flight = driver.findElement(By.linkText("Flights"));
		flight.click();
		Thread.sleep(6000);
		WebElement dates = driver.findElement(By.name("EGDSDateRange-date-selector-trigger"));
		dates.click();
		Thread.sleep(6000);
		WebElement departdt = driver.findElement(By.xpath("(//*[@class='uitk-date-number uitk-date-number-default uitk-type-300 uitk-type-regular'])[4]"));
		departdt.click();
		Thread.sleep(6000);
		
		

	}

}
