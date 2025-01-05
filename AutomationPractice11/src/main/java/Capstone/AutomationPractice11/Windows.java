package Capstone.AutomationPractice11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository25\\AutomationPractice11\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement owindow = driver.findElement(By.id("openwindow"));
		owindow.click();
		String currentwhandle = driver.getWindowHandle();
		System.out.println(currentwhandle);
		Set<String> wHandles = driver.getWindowHandles();
		Iterator<String> iterators = wHandles.iterator();
		String FirstHandle = iterators.next();
		String SecondHandle = iterators.next();
		System.out.println("This is : " + FirstHandle);
		System.out.println("This is : " + SecondHandle);
		driver.switchTo().window(SecondHandle);
		WebElement courses = driver.findElement(By.xpath("//*[text()='Courses']"));
		courses.click();
		

	}

}
