package com.TestNG;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 1)
	public void getTest1() {
		System.out.println("Test 1  will execute.");
	}
	@Test(priority = 2)
	public void getTest2() {
		System.out.println("Test 2 will execute.");
	}
	@Test(priority =3 )
	public void getTest3() {
		System.out.println("Test 3 will execute.");
	}
	


}
