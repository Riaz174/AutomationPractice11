package Capstone.AutomationPractice11;

import org.testng.annotations.Test;

import Amazon.pages.HomeOfFacebook;
import Common.Utilities;

import org.testng.annotations.DataProvider;

public class Points extends Utilities {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  HomeOfFacebook book = new HomeOfFacebook(driver);
	  book.email(n);
	  book.pwordF(s);
	  book.logClick();
  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Ali", "abcdef" },
      new Object[] { "Saleem", "ghijkl" },
      new Object [] {"Rabia", "mnopqrs" },
    };
  }
}
