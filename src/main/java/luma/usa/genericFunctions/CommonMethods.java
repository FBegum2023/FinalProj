package luma.usa.genericFunctions;
import java.io.File;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import luma.usa.basepage.SuperClass;

public class CommonMethods extends SuperClass {
	
	public static void captureScreenshot( String screenshotName) {
		try {
			//codes for screenshot
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File("./Screenshot/" + screenshotName + ".png"));
			System.out.println("Screenshot taken");
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}	 	
	
	public static void HoverOver(WebElement ele) {
	//Action mouse Hover
		Actions ac =new Actions(driver);
		ac.moveToElement(ele).build().perform();
	}
	//Action click
	public static void actionClick(WebElement ele) {
		Actions ac= new Actions(driver);
		ac.click(ele).build().perform();
	}
	//JS click
	public static void jsClick(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele);
		
	}
	
	//Handling Dropdown
	// 1. By using select class
	
	public static void dropDown(WebElement ele, String text) {//select class
		Select se=new Select(ele);//class
		se.selectByVisibleText(text);
		//se.selectByValue("43");
		//se.selectByIndex(43);
		
	}
	// 2. By using List interface
	public static void handleDropdown(List<WebElement> ele, String text) {
		List <WebElement>select = ele;
		for(WebElement value: select) {
			String listOfDropDown =value.getText();
			if(listOfDropDown.equalsIgnoreCase("text")) {
				CommonMethods.actionClick(value);	
			}
		}
	}
//	 public static void getPageRefresh() {
//		 driver.navigate().refresh();
//	 }

		
	 
}

