package Capstone.AutomationPractice11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowser {
	 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice11\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(6000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(6000);
		String wHandle = driver.getWindowHandle();
		System.out.println(wHandle);
		

	}

}
