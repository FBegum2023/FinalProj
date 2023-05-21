package com.TestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
	//Test case will multiple time as directed
	@Test(invocationCount = 3)
	public void getTest() {
		System.out.println("Test will execute.");
	}

}
