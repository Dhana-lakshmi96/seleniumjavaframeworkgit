package com.selenium.test;

import org.testng.annotations.Test;

public class GroupingTestNg_Demo {


	@Test(groups= {"sanity"})
	public void test1() {
		
		System.out.println("this is test 1");
	}
	
	@Test(groups= {"sanity","smoke"})
	public void test2() {
		System.out.println("this is test 2");
	}
	
	@Test(groups= {"regression","sanity"})
	public void test3() {
		System.out.println("this is test 3");
	}
	
	@Test(groups= {"smoke"})
	public void test4() {
		System.out.println("this is test 4");

	}
	
	public void test5() {
		System.out.println("this is test 5");

	}

}
