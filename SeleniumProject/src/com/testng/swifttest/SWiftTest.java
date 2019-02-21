package com.testng.swifttest;


import org.testng.annotations.Test;

public class SWiftTest {

	@Test(groups= {"smokeTest"})
	public void createSwiftTest() {
		System.out.println("execute createSwiftTest");
		
	}
	
	@Test(groups= {"regressionTest"})
	public void modifySWiftTest() {
		System.out.println("execute modifySWiftTest");
	}
	@Test(groups= {"regressionTest"})
	public void deleteSwiftTest() {
		System.out.println("execute deleteSwiftTest ");
		
	}


}
