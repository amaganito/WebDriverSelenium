package com.bss.credo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;


public class AddPhoneTest {
	
	WebDriver driver = new FirefoxDriver();
  @Test
  public void testCartDetailsAddingPhoneData() {
	  
	  driver.findElement(By.xpath("//*[@value='Android']")).click();
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver.get("http://www.credomobile.com/phones");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.close();
  }

}
