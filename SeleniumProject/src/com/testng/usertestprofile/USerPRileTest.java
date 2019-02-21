package com.testng.usertestprofile;


import org.testng.annotations.Test;

import com.lt.genericlib.BaseClass;

public class USerPRileTest extends BaseClass{
 
	
	@Test(groups= {"smokeTest"})
	public void createRoleTest() throws Throwable {
		Thread.sleep(5000);
		System.out.println("execute createRoleTest");
		
	}
	
	@Test(groups= {"regressionTest"})
	public void mofidyRoleUSerTest() {
		System.out.println("execute mofidyRoleUSerTest");
	}
	
	@Test(groups= {"regressionTest"})
	public void deleteUSerRoleTest() {
		System.out.println("execute deleteUSerRoleTest ");
		
	}


}
