package com.TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CrossBrowserTesting {
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void setUp(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			//System.out.println("Driver will execute by Chrome");
			WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					System.out.println("Chrome opened");

		}
		else if(browser.equalsIgnoreCase("Edge")){
			//System.out.println("Driver will execute by Edge");
				WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					System.out.println("Edge opened");

		
		}	
		else if(browser.equalsIgnoreCase("Firefox")){
			//System.out.println("Driver will execute by Firefox");
			WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				System.out.println("Firefox opened");
       }
		
	}
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Browsers will be close.");
		
	}
	@Test
	public void getTest() {
		
	driver.get("https://magento.softwaretestingboard.com/");
	driver.manage().window().maximize();
	
}

}
