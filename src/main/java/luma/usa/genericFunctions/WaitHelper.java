package luma.usa.genericFunctions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import luma.usa.basepage.SuperClass;

public class WaitHelper extends SuperClass{
	public static void seleniumWait(WebElement ele) {
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
	
	public static void waitUntilVisibilityOfElements(List<WebElement> ele) {
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		
	}

}
