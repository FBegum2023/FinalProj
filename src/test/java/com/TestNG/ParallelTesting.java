package com.TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {
	WebDriver driver;
	@Test
	public void getOpenBrowserNode1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		System.out.println("Browser 1 open");
	}
	@Test
	public void getOpenBrowserNode2() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		System.out.println("Browser 2 open");
	}
	@Test
	public void getOpenBrowserNode3() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		System.out.println("Browser 3 open");
	}
	@Test
	public void getOpenBrowserNode4() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		System.out.println("Browser 4 open");
		System.out.println("*****************************");
	}

}
