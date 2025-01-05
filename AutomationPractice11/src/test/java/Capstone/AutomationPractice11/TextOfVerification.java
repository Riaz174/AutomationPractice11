package Capstone.AutomationPractice11;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Amazon.pages.HomeOfFacebook;
import Common.Utilities;

import org.testng.*;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class TextOfVerification extends Utilities {
	
  
@Test(priority = 2,dependsOnMethods = "signin")
  public void f() throws IOException, InterruptedException   {
	
		  HomeOfFacebook book = new HomeOfFacebook(driver);
		  String tx = book.verifictionOfText();
		  shots();
		  System.out.println(tx);
		 // Assert.assertEquals(tx, "Facebook helps you connect and share with the people in your life.");
		  SoftAssert st = new SoftAssert();
		 Thread.sleep(2000);
		  shots();
		  st.assertEquals(tx, "Facebook helps you connect and share with the people in your life.");
		  System.out.println("This is after assertion");
		  Thread.sleep(2000);
		  shots();
		  st.assertAll();
		   }
	@Test(priority = 1)
  public void signin(String id) {
	  HomeOfFacebook book = new HomeOfFacebook(driver);
	  book.email(id);
	  book.pwordF(id);
	  book.logClick();
  }
  }


