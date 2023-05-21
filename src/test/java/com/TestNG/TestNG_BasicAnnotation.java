package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_BasicAnnotation {
	@Test
	public void TestCase1() {
		System.out.println("This is a normal Test Case.");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("This will execute Before every Method.");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("This will execute after every Method.");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("This will execute Before Test.");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("This will execute After Test.");
	}
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("This will execute before suite.");
	}
	@AfterSuite
	public void AfterSuit() {
		System.out.println("This will execute after suite");
	}
	
}
