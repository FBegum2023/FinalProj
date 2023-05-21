package com.TestNG;

import org.testng.annotations.Test;

public class Login {
	//If you have multiple testcases and if you want to run few of them then what you have to do.
	
	@Test(enabled = false)
	public void getTest1() {
		System.out.println("Test1");
	}
	@Test(enabled = false)
	public void getTest2() {
		System.out.println("Test2");
	}
	@Test(enabled = false)
	public void getTest3() {
		System.out.println("Test3");
	}
	@Test(enabled = true)
	public void getTest4() {
		System.out.println("Test4");
	}


}
