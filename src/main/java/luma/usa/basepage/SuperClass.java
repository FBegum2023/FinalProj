package luma.usa.basepage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuperClass {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	
	
	public SuperClass(){
		try {
			log = Logger.getLogger("Automation Tester");
			PropertyConfigurator.configure("log4j.properties");
			//Properties is an object
			//any file xl,csv we need fileInputStream
			//connect the properties file from config.properties
			prop=new Properties();
			FileInputStream fs=new FileInputStream("./src/main/java/luma/usa/config/config.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void initialization(){
		String browser=prop.getProperty("browserName");
		
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();

		}
		else if(browser.equalsIgnoreCase("Edge")){
				WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();

		
		}	
		else if(browser.equalsIgnoreCase("Firefox")){
			WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
       }
		else {
			System.out.println("====No Browser found===");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get(prop.getProperty("QAURL"));
   }
}