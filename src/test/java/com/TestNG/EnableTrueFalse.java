package com.TestNG;

import org.testng.annotations.Test;

public class EnableTrueFalse {
	@Test(enabled = true)
	public void getTest1() {
		System.out.println("Test 1  will execute.");
	}
	@Test(enabled = false)
	public void getTest2() {
		System.out.println("Test 2 will execute.");
	}
	@Test(enabled = true)
	public void getTest3() {
		System.out.println("Test 3 will execute.");
	}
	@Test(enabled = false)
	public void getTest4() {
		System.out.println("Test 4 will execute.");
	}
	@Test(enabled = false)
	public void getTest5() {
		System.out.println("Test 5 will execute.");
	}

}
