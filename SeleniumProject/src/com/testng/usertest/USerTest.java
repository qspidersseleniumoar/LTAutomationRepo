package com.testng.usertest;


import org.testng.annotations.Test;

import com.lt.genericlib.BaseClass;

public class USerTest {

	@Test
	public void createUSerTest() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("execute createUSerTest");
		
	}
	
	@Test(groups= {"regressionTest"})
	public void modifyUSerTest() {
		System.out.println("execute createUSerTest");
	}
	@Test(groups= {"regressionTest"})
	public void deleteUSerTest() {
		System.out.println("execute deleteUSerTest ");
		
	}


}
