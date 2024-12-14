package Capstone.AutomationPractice11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice11\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement cnaccount = driver.findElement(By.linkText("Create new account"));
		cnaccount.click();
		Thread.sleep(6000);
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("John");
		Thread.sleep(6000);
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Doe");
		Thread.sleep(6000);
		WebElement dayofbirth = driver.findElement(By.name("birthday_day"));
		Select st = new Select(dayofbirth);
		st.selectByValue("27");
		Thread.sleep(6000);
		WebElement monthofbirth = driver.findElement(By.name("birthday_month"));
		Select sd = new Select(monthofbirth);
		sd.selectByIndex(7);
		Thread.sleep(6000);
		WebElement yofbirth = driver.findElement(By.name("birthday_year"));
		Select sy = new Select(yofbirth);
		sy.selectByVisibleText("1998");
		Thread.sleep(6000);
		WebElement gender = driver.findElement(By.xpath("(//*[@name='sex'])[1]"));
		gender.click();
		Thread.sleep(3000);
		
		
		
		

	}

}
