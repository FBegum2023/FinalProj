package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_DependsOnMethod {
	@Test
	public void getMethod1() {
		System.out.println(" Browser will open.");
	}
	@Test(dependsOnMethods = {"getMethod1"})
	public void getMethod2() {
		System.out.println(" Successful Login application.");
		
	}
	@Test(dependsOnMethods = {"getMethod2"})
	public void getMethod3() {
		System.out.println(" Expected and actual matching.");
		
	}

}
