package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
	WebDriver driver;
	@DataProvider(name="Authentication")
	public static Object[][] credentials(){
		return new Object [][] {{"tahiya04@yahoo.com","tester1"},
	    						{"tahiy32@yahoo.com\",\"tester2"},
	    						{"tahiya04@yahoo.com","tester1"}};
	}
	@Test(dataProvider = "Authentication")
	public void getLogin(String userName, String Password) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[1]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
		driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();
		
	}
}
