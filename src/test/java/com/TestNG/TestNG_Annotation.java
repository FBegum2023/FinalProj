package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Annotation {
	//@BeforeMethod
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser will open.");
		
	}
	//@AfterMethod
	@AfterClass
public void closeBrowser() {
	System.out.println("Browser will close.");
		
	}
	@Test
public void getTest1() {
	System.out.println("Test will execute test1.");
	
}
	@Test
public void getTest2() {
	System.out.println("Test will execute test2.");
	
}

}
